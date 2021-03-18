package com.erbe.justdaggerhilt.data.repository

import com.erbe.justdaggerhilt.data.api.ApiHelper
import javax.inject.Inject

class MainRepository @Inject constructor(private val apiHelper: ApiHelper) {

    suspend fun getUsers() = apiHelper.getUsers()
}