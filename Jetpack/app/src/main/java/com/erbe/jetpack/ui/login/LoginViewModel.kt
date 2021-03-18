package com.erbe.jetpack.ui.login

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class LoginViewModel : ViewModel() {

    val progress = MutableLiveData<Boolean>()
    val loginSuccess = MutableLiveData<Boolean>()

    init {
        progress.value = false
    }

    fun onServerLoginClick() {
        progress.value = true
        loginSuccess.value = true
    }

    fun onGoogleLoginClick() {
    }

    fun onFbLoginClick() {
    }
}