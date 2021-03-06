package com.erbe.jetpack.ui.feed.blog

import androidx.lifecycle.LiveData
import androidx.lifecycle.Transformations
import androidx.lifecycle.ViewModel
import androidx.paging.LivePagedListBuilder
import androidx.paging.PagedList
import com.erbe.jetpack.data.datasource.BlogDSFactory
import com.erbe.jetpack.data.model.api.BlogResponse
import com.erbe.jetpack.utils.NetworkState
import java.util.concurrent.Executors

class BlogViewModel : ViewModel() {

    var repoLiveData: LiveData<PagedList<BlogResponse.Blog>>? = null
    var progress: LiveData<NetworkState>? = null

    init {
        val dsFactory = BlogDSFactory()
        progress = Transformations.switchMap(dsFactory.dataSource) {
            it.getNetworkState()
        }
        setUpPagedList(dsFactory)
    }

    private fun setUpPagedList(DSFactory: BlogDSFactory) {
        val executor = Executors.newFixedThreadPool(2)
        val pagedListConfig = PagedList.Config.Builder()
            .setEnablePlaceholders(false)
            .setInitialLoadSizeHint(5)
            .setPageSize(10).build()
        repoLiveData = LivePagedListBuilder(DSFactory, pagedListConfig)
            .setFetchExecutor(executor)
            .build()
    }

    interface BlogItemClickHandler {
        fun onBlogItemClicked(repo: BlogResponse.Blog)
    }
}