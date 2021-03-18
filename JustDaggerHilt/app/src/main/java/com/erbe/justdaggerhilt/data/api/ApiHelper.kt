package com.erbe.justdaggerhilt.data.api

import com.erbe.justdaggerhilt.data.model.User
import retrofit2.Response

interface ApiHelper {

    suspend fun getUsers(): Response<List<User>>
}