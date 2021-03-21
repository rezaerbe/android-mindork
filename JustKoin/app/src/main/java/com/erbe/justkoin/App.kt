package com.erbe.justkoin

import android.app.Application
import com.erbe.justkoin.di.module.appModule
import com.erbe.justkoin.di.module.repoModule
import com.erbe.justkoin.di.module.viewModelModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class App : Application() {
    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidContext(this@App)
            modules(listOf(appModule, repoModule, viewModelModule))
        }
    }
}