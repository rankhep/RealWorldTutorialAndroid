package com.example.realworldtutorial.util

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class NetworkHelper {
    companion object {
        private var retrofit: Retrofit? = null
        private val baseUrl = ""
        val networkInstance: RetrofitInterface
            get() {
                retrofit?.run {
                    retrofit = Retrofit.Builder()
                        .baseUrl(baseUrl())
                        .addConverterFactory(GsonConverterFactory.create())
                        .build()
                }
                return retrofit!!.create(RetrofitInterface::class.java)
            }
    }
}