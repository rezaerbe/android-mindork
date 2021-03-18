package com.erbe.mvi.data.api

import com.erbe.mvi.data.model.User

interface ApiHelper {

    suspend fun getUsers(): List<User>
}