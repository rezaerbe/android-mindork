package com.erbe.mvi.data.repository

import com.erbe.mvi.data.api.ApiHelper

class MainRepository(private val apiHelper: ApiHelper) {

    suspend fun getUsers() = apiHelper.getUsers()
}