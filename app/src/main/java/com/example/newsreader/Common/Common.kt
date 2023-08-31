package com.example.newsreader.Common

import com.example.newsreader.Interface.NewsService
import com.example.newsreader.Remote.RetrofitClient

object Common{
    val BASE_URL = "https://newsapi.org/"
    val API_KEY="df601cb16b3c4ac3ae2a4dfb293bdb97"


    val newsService:NewsService
        get()= RetrofitClient.getClient(BASE_URL).create(NewsService::class.java)
}