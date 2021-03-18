package com.erbe.jetpack.data.datasource

import androidx.lifecycle.MutableLiveData
import androidx.paging.DataSource
import com.erbe.jetpack.data.model.api.OpenSourceResponse

class OpenSourceDSFactory : DataSource.Factory<Long, OpenSourceResponse.Repo>() {
    val dataSource: MutableLiveData<OpenSourceDataSource> = MutableLiveData()

    override fun create(): DataSource<Long, OpenSourceResponse.Repo> {
        var openSourceDataSource = OpenSourceDataSource()
        dataSource.postValue(openSourceDataSource)
        return openSourceDataSource
    }
}