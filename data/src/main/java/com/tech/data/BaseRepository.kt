package com.tech.data

import com.tech.domain.Repository
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class BaseRepository(
    private val service: PlaceholderService
) : Repository {

    constructor() : this(
        Retrofit.Builder()
            .baseUrl("https://jsonplaceholder.typicode.com/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(PlaceholderService::class.java)
    )

    override suspend fun loadTitle(): Pair<Boolean, String> {
        return try {
            val title = service.getTitle().title
            Pair(true, title)
        } catch (e: Exception) {
            Pair(false, e.message ?: "error")
        }
    }
}