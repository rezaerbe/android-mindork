package com.erbe.justkoin.di.module

import com.erbe.justkoin.data.repository.MainRepository
import org.koin.dsl.module

val repoModule = module {
    single {
        MainRepository(get())
    }
}