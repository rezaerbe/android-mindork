package com.erbe.justdaggerhilt.data.api

import com.erbe.justdaggerhilt.data.model.User
import retrofit2.Response
import retrofit2.http.GET

interface ApiService {

    @GET("users")
    suspend fun getUsers(): Response<List<User>>
}