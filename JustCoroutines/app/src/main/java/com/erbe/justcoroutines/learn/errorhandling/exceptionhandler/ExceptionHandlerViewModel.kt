package com.erbe.justcoroutines.learn.errorhandling.exceptionhandler

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.erbe.justcoroutines.data.api.ApiHelper
import com.erbe.justcoroutines.data.local.DatabaseHelper
import com.erbe.justcoroutines.data.model.ApiUser
import com.erbe.justcoroutines.utils.Resource
import kotlinx.coroutines.CoroutineExceptionHandler
import kotlinx.coroutines.launch

class ExceptionHandlerViewModel(
    private val apiHelper: ApiHelper,
    private val dbHelper: DatabaseHelper
) : ViewModel() {

    private val users = MutableLiveData<Resource<List<ApiUser>>>()

    private val exceptionHandler = CoroutineExceptionHandler { _, exception ->
        users.postValue(Resource.error("Something Went Wrong", null))
    }

    init {
        fetchUsers()
    }

    private fun fetchUsers() {
        viewModelScope.launch(exceptionHandler) {
            users.postValue(Resource.loading(null))
            val usersFromApi = apiHelper.getUsers()
            users.postValue(Resource.success(usersFromApi))
        }
    }

    fun getUsers(): LiveData<Resource<List<ApiUser>>> {
        return users
    }
}