package com.erbe.jetpack.data.database

import androidx.room.Database
import androidx.room.RoomDatabase
import com.erbe.jetpack.data.database.repository.options.Option
import com.erbe.jetpack.data.database.repository.options.OptionsDao
import com.erbe.jetpack.data.database.repository.questions.Question
import com.erbe.jetpack.data.database.repository.questions.QuestionsDao

@Database(entities = [(Question::class), (Option::class)], version = 1)
abstract class AppDatabase : RoomDatabase() {

    abstract fun optionsDao(): OptionsDao

    abstract fun questionsDao(): QuestionsDao
}