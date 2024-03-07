package com.tech.data

import retrofit2.http.GET
import retrofit2.Call

interface PlaceholderService {

    //https://jsonplaceholder.typicode.com/todos/2
    @GET("todos/2")
    suspend fun getTitle(): PlaceholderTitleCloud
}