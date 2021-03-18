package com.erbe.mvvm.data.repository

import com.erbe.mvvm.data.api.ApiHelper
import com.erbe.mvvm.data.model.User
import io.reactivex.Single

class MainRepository(private val apiHelper: ApiHelper) {

    fun getUsers(): Single<List<User>> {
        return apiHelper.getUsers()
    }
}