package com.erbe.jetpack.data.datasource

import androidx.lifecycle.MutableLiveData
import androidx.paging.PageKeyedDataSource
import com.erbe.jetpack.BuildConfig
import com.erbe.jetpack.data.model.api.OpenSourceResponse
import com.erbe.jetpack.data.remote.ApiHeader
import com.erbe.jetpack.data.remote.AppApiHelper
import com.erbe.jetpack.utils.NetworkState

class OpenSourceDataSource : PageKeyedDataSource<Long, OpenSourceResponse.Repo>() {

    private val header = ApiHeader(
        ApiHeader.PublicApiHeader(BuildConfig.API_KEY),
        ApiHeader.ProtectedApiHeader(BuildConfig.API_KEY, 1, BuildConfig.BASE_URL)
    )
    private val apiHelper = AppApiHelper(header)
    private var networkState: MutableLiveData<NetworkState>? = MutableLiveData()

    override fun loadInitial(
        params: LoadInitialParams<Long>,
        callback: LoadInitialCallback<Long, OpenSourceResponse.Repo>
    ) {
        apiHelper.getOpenSourceApiCall(1)
            .doOnSubscribe {
                networkState?.postValue(
                    NetworkState(
                        NetworkState.Status.RUNNING,
                        "Loading"
                    )
                )
            }
            .subscribe({
                if (it.statusCode == "success") {
                    callback.onResult(it.data, null, 2L)
                    networkState?.postValue(NetworkState(NetworkState.Status.SUCCESS, it.message))
                } else {
                    networkState?.postValue(NetworkState(NetworkState.Status.FAILED, it.message))
                }
            }, {
                networkState?.postValue(NetworkState(NetworkState.Status.FAILED, it.message))
            })
    }

    override fun loadAfter(
        params: LoadParams<Long>,
        callback: LoadCallback<Long, OpenSourceResponse.Repo>
    ) {
        apiHelper.getOpenSourceApiCall(params.key.toInt())
            .doOnSubscribe {
                networkState?.postValue(
                    NetworkState(
                        NetworkState.Status.RUNNING,
                        "Loading"
                    )
                )
            }
            .subscribe({
                if (it.statusCode == "success") {
                    var nextPage = if (params.key.toInt() == 4) null else params.key.plus(1)
                    if (params.key.toInt() == 4) {
                        nextPage = null
                        networkState?.postValue(
                            NetworkState(
                                NetworkState.Status.ALL_RESULTS_LOADED,
                                it.message
                            )
                        )
                    } else {
                        networkState?.postValue(
                            NetworkState(
                                NetworkState.Status.SUCCESS,
                                it.message
                            )
                        )
                    }
                    callback.onResult(it.data, nextPage)

                } else {
                    networkState?.postValue(NetworkState(NetworkState.Status.FAILED, it.message))
                }
            }, {
                networkState?.postValue(NetworkState(NetworkState.Status.FAILED, it.message))
            })
    }

    override fun loadBefore(
        params: LoadParams<Long>,
        callback: LoadCallback<Long, OpenSourceResponse.Repo>
    ) {
    }

    fun getNetworkState() = networkState
}