package com.erbe.jetpack.ui.feed.opensource

import androidx.lifecycle.LiveData
import androidx.lifecycle.Transformations
import androidx.lifecycle.ViewModel
import androidx.paging.LivePagedListBuilder
import androidx.paging.PagedList
import com.erbe.jetpack.data.datasource.OpenSourceDSFactory
import com.erbe.jetpack.data.model.api.OpenSourceResponse
import com.erbe.jetpack.utils.NetworkState
import java.util.concurrent.Executors

class OpenSourceViewModel : ViewModel() {

    var repoLiveData: LiveData<PagedList<OpenSourceResponse.Repo>>? = null
    var progress: LiveData<NetworkState>? = null

    init {
        val dsFactory = OpenSourceDSFactory()
        progress = Transformations.switchMap(dsFactory.dataSource) {
            it.getNetworkState()
        }
        setUpPagedList(dsFactory)
    }

    private fun setUpPagedList(DSFactory: OpenSourceDSFactory) {
        val executor = Executors.newFixedThreadPool(2)
        val pagedListConfig = PagedList.Config.Builder()
            .setEnablePlaceholders(false)
            .setInitialLoadSizeHint(5)
            .setPageSize(10).build()
        repoLiveData = LivePagedListBuilder(DSFactory, pagedListConfig)
            .setFetchExecutor(executor)
            .build()
    }

    interface OpenSourceItemClickHandler {
        fun onOpenSourceItemClicked(repo: OpenSourceResponse.Repo)
    }
}