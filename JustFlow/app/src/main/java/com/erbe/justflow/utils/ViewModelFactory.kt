package com.erbe.justflow.utils

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.erbe.justflow.data.api.ApiHelper
import com.erbe.justflow.data.local.DatabaseHelper
import com.erbe.justflow.learn.completion.CompletionViewModel
import com.erbe.justflow.learn.errorhandling.catch.CatchViewModel
import com.erbe.justflow.learn.errorhandling.emitall.EmitAllViewModel
import com.erbe.justflow.learn.filter.FilterViewModel
import com.erbe.justflow.learn.map.MapViewModel
import com.erbe.justflow.learn.reduce.ReduceViewModel
import com.erbe.justflow.learn.retrofit.parallel.ParallelNetworkCallsViewModel
import com.erbe.justflow.learn.retrofit.series.SeriesNetworkCallsViewModel
import com.erbe.justflow.learn.retrofit.single.SingleNetworkCallViewModel
import com.erbe.justflow.learn.retry.RetryViewModel
import com.erbe.justflow.learn.retryexponentialbackoff.RetryExponentialBackoffModel
import com.erbe.justflow.learn.retrywhen.RetryWhenViewModel
import com.erbe.justflow.learn.room.RoomDBViewModel
import com.erbe.justflow.learn.task.onetask.LongRunningTaskViewModel
import com.erbe.justflow.learn.task.twotasks.TwoLongRunningTasksViewModel

class ViewModelFactory(private val apiHelper: ApiHelper, private val dbHelper: DatabaseHelper) :
    ViewModelProvider.Factory {

    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(SingleNetworkCallViewModel::class.java)) {
            return SingleNetworkCallViewModel(apiHelper, dbHelper) as T
        }
        if (modelClass.isAssignableFrom(SeriesNetworkCallsViewModel::class.java)) {
            return SeriesNetworkCallsViewModel(apiHelper, dbHelper) as T
        }
        if (modelClass.isAssignableFrom(ParallelNetworkCallsViewModel::class.java)) {
            return ParallelNetworkCallsViewModel(apiHelper, dbHelper) as T
        }
        if (modelClass.isAssignableFrom(RoomDBViewModel::class.java)) {
            return RoomDBViewModel(apiHelper, dbHelper) as T
        }
        if (modelClass.isAssignableFrom(CatchViewModel::class.java)) {
            return CatchViewModel(apiHelper, dbHelper) as T
        }
        if (modelClass.isAssignableFrom(EmitAllViewModel::class.java)) {
            return EmitAllViewModel(apiHelper, dbHelper) as T
        }
        if (modelClass.isAssignableFrom(LongRunningTaskViewModel::class.java)) {
            return LongRunningTaskViewModel(apiHelper, dbHelper) as T
        }
        if (modelClass.isAssignableFrom(TwoLongRunningTasksViewModel::class.java)) {
            return TwoLongRunningTasksViewModel(apiHelper, dbHelper) as T
        }
        if (modelClass.isAssignableFrom(CompletionViewModel::class.java)) {
            return CompletionViewModel(apiHelper, dbHelper) as T
        }
        if (modelClass.isAssignableFrom(FilterViewModel::class.java)) {
            return FilterViewModel(apiHelper, dbHelper) as T
        }
        if (modelClass.isAssignableFrom(MapViewModel::class.java)) {
            return MapViewModel(apiHelper, dbHelper) as T
        }
        if (modelClass.isAssignableFrom(ReduceViewModel::class.java)) {
            return ReduceViewModel(apiHelper, dbHelper) as T
        }
        if (modelClass.isAssignableFrom(RetryViewModel::class.java)) {
            return RetryViewModel(apiHelper, dbHelper) as T
        }
        if (modelClass.isAssignableFrom(RetryWhenViewModel::class.java)) {
            return RetryWhenViewModel(apiHelper, dbHelper) as T
        }
        if (modelClass.isAssignableFrom(RetryExponentialBackoffModel::class.java)) {
            return RetryExponentialBackoffModel(apiHelper, dbHelper) as T
        }
        throw IllegalArgumentException("Unknown class name")
    }
}