package com.erbe.justcoroutines.data.local

import com.erbe.justcoroutines.data.local.entity.User

interface DatabaseHelper {

    suspend fun getUsers(): List<User>

    suspend fun insertAll(users: List<User>)
}