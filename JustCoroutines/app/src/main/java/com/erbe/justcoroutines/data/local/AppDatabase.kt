package com.erbe.justcoroutines.data.local

import androidx.room.Database
import androidx.room.RoomDatabase
import com.erbe.justcoroutines.data.local.dao.UserDao
import com.erbe.justcoroutines.data.local.entity.User

@Database(entities = [User::class], version = 1)
abstract class AppDatabase : RoomDatabase() {

    abstract fun userDao(): UserDao
}