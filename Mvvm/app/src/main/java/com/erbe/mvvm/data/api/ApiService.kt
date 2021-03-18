package com.erbe.mvvm.data.api

import com.erbe.mvvm.data.model.User
import io.reactivex.Single

interface ApiService {

    fun getUsers(): Single<List<User>>
}