package com.erbe.mvi.data.api

import com.erbe.mvi.data.model.User
import retrofit2.http.GET

interface ApiService {

    @GET("users")
    suspend fun getUsers(): List<User>
}