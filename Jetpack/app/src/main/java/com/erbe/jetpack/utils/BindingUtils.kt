package com.erbe.jetpack.utils

import androidx.databinding.BindingAdapter
import com.erbe.jetpack.data.database.repository.questions.Question
import com.erbe.jetpack.ui.question.QuestionCard
import com.erbe.jetpack.ui.question.QuestionViewModel
import com.mindorks.placeholderview.SwipePlaceHolderView

@BindingAdapter("adapter", "action")
fun addQuestionItems(view: SwipePlaceHolderView, questions: List<Question>?, action: Int) {
    questions?.let {
        if (action == QuestionViewModel.ACTION_ADD_ALL)
            view.removeAllViews()
        for (question in questions) {
            if (question?.options != null && question?.options?.size === 3) {
                view.addView(QuestionCard(question))
            }
        }
    }
}