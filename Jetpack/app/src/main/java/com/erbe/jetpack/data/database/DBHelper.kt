package com.erbe.jetpack.data.database

import androidx.lifecycle.LiveData
import com.erbe.jetpack.data.database.repository.options.Option
import com.erbe.jetpack.data.database.repository.questions.Question
import io.reactivex.Flowable
import io.reactivex.Observable
import io.reactivex.Single

interface DBHelper {
    fun getAllQuestions(): Single<List<Question>>?

    fun getOptionsForQuestionId(questionId: Long?): List<Option>?

    fun isOptionEmpty(): Observable<Boolean>

    fun isQuestionEmpty(): Observable<Boolean>

    fun saveOptionList(optionList: List<Option>): Observable<Boolean>

    fun saveQuestionList(optionList: List<Question>): Observable<Boolean>
}