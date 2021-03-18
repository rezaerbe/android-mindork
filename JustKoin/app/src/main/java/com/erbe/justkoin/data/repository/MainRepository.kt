package com.erbe.justkoin.data.repository

import com.erbe.justkoin.data.api.ApiHelper

class MainRepository (private val apiHelper: ApiHelper) {

    suspend fun getUsers() =  apiHelper.getUsers()
}