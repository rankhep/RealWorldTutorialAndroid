package com.example.realworldtutorial.main

import android.util.Log
import android.view.View
import android.widget.Toast
import androidx.annotation.IntegerRes
import androidx.lifecycle.MediatorLiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModel
import com.example.realworldtutorial.model.Article
import com.example.realworldtutorial.model.Articles
import com.example.realworldtutorial.util.NetworkHelper
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainViewModel : ViewModel() {

    private val isFetch = MutableLiveData<Boolean>()
    private val articleList = MutableLiveData<List<Article>>()

    val loadingProgressVisibility = MediatorLiveData<Int>()

    init {
        fetchData()
        loadingProgressVisibility.addSource(isFetch, Observer {
            loadingProgressVisibility.value = if (it) View.VISIBLE else View.GONE
        })
    }

    private fun fetchData() {
        isFetch.value = true
        NetworkHelper.networkInstance.getArticleList().enqueue(object : Callback<Articles> {
            override fun onFailure(call: Call<Articles>, t: Throwable) {
                t.printStackTrace()
            }

            override fun onResponse(call: Call<Articles>, response: Response<Articles>) {
                if (response.isSuccessful){
                    response.body()?.articles?.let {
                        articleList.value = it
                    }
                }else{
                    Log.e("Network Error", response.message())
                }
            }

        })
    }
}