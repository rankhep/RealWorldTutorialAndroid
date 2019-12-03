package com.example.realworldtutorial.util

import com.example.realworldtutorial.model.Articles
import com.example.realworldtutorial.model.LoginModel
import com.example.realworldtutorial.model.User
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST

interface RetrofitInterface {

    @POST("/api/users/login")
    fun loginUser(@Body body: LoginBody): Call<User>

    class LoginBody(val user: LoginModel)

    @GET("/api/articles")
    fun getArticleList(): Call<Articles>
}
