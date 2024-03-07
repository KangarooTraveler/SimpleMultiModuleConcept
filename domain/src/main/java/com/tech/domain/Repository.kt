package com.tech.domain

interface Repository {

    suspend fun loadTitle(): Pair<Boolean, String>
}