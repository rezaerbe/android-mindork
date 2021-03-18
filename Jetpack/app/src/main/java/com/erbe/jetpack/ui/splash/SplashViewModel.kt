package com.erbe.jetpack.ui.splash

import android.content.Context
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.erbe.jetpack.data.AppDataManager

class SplashViewModel(context: Context?) : ViewModel() {
    private val dataManager = AppDataManager.getInstance(context)

    init {
        dataManager.seedQuestions()
            .flatMap { dataManager.seedOptions() }
            .subscribe({
            }, { })
    }

    val isUserLoggedIn = MutableLiveData<Boolean>()

    init {
        isUserLoggedIn.value = true
    }
}