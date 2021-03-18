package com.erbe.justkoin.data.api

import com.erbe.justkoin.data.model.User
import retrofit2.Response

interface ApiHelper {

    suspend fun getUsers(): Response<List<User>>
}