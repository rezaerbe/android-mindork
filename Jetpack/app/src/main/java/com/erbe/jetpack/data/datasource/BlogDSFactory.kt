package com.erbe.jetpack.data.datasource

import androidx.lifecycle.MutableLiveData
import androidx.paging.DataSource
import com.erbe.jetpack.data.model.api.BlogResponse

class BlogDSFactory : DataSource.Factory<Long, BlogResponse.Blog>() {
    val dataSource: MutableLiveData<BlogDataSource> = MutableLiveData()

    override fun create(): DataSource<Long, BlogResponse.Blog> {
        var blogDataSource = BlogDataSource()
        dataSource.postValue(blogDataSource)
        return blogDataSource
    }
}