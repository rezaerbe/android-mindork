package com.erbe.jetpack.data.database

import android.content.Context
import androidx.room.Room
import com.erbe.jetpack.data.database.repository.options.Option
import com.erbe.jetpack.data.database.repository.questions.Question
import io.reactivex.Observable

const val APP_DATABASE_NAME = "mindorks_jetpack_db"

class AppDBHelper : DBHelper {

    companion object {

        @Volatile
        private var instance: AppDBHelper? = null

        @Volatile
        private var database: AppDatabase? = null

        fun getInstance(context: Context) =
            instance ?: synchronized(this) {
                instance
                    ?: AppDBHelper().also {
                        instance = it
                        database = Room.databaseBuilder(
                            context, AppDatabase::class.java,
                            APP_DATABASE_NAME
                        )
                            .fallbackToDestructiveMigration()
                            .allowMainThreadQueries()
                            .build()
                    }
            }
    }

    override fun isOptionEmpty() = Observable.fromCallable {
        return@fromCallable true
    }

    override fun isQuestionEmpty() = Observable.fromCallable {
        return@fromCallable true
    }

    override fun getAllQuestions() = database?.questionsDao()?.loadAll()

    override fun getOptionsForQuestionId(questionId: Long?) =
        database?.optionsDao()?.loadOptionsByQuestionId(questionId)

    override fun saveOptionList(optionList: List<Option>) = Observable.fromCallable {
        database?.optionsDao()?.insertAll(optionList)
        true
    }

    override fun saveQuestionList(questionList: List<Question>) = Observable.fromCallable {
        database?.questionsDao()?.insertAll(questionList)
        true
    }
}