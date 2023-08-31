package com.example.newsreader.Interface

import retrofit2.http.GET
import com.example.newsreader.Model.WebSite
import retrofit2.Call

interface NewsService {

    @get:GET("v2/everything?q=bitcoin&apiKey=df601cb16b3c4ac3ae2a4dfb293bdb97")
    val sources:Call<WebSite>
}