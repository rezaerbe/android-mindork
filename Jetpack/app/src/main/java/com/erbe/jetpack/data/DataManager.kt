package com.erbe.jetpack.data

import com.erbe.jetpack.data.database.DBHelper
import com.erbe.jetpack.data.database.repository.questions.Question
import io.reactivex.Observable
import io.reactivex.Single

interface DataManager : DBHelper {
    fun seedQuestions(): Observable<Boolean>

    fun seedOptions(): Observable<Boolean>

    fun getQuestionCardData(): Single<List<Question>>
}