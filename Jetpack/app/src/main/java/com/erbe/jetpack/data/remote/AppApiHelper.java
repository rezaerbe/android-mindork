package com.erbe.jetpack.data.remote;

import com.erbe.jetpack.data.model.api.BlogResponse;
import com.erbe.jetpack.data.model.api.LoginRequest;
import com.erbe.jetpack.data.model.api.LoginResponse;
import com.erbe.jetpack.data.model.api.LogoutResponse;
import com.erbe.jetpack.data.model.api.OpenSourceResponse;
import com.rx2androidnetworking.Rx2AndroidNetworking;

import io.reactivex.Single;

public class AppApiHelper implements ApiHelper {

    private ApiHeader mApiHeader;

    public AppApiHelper(ApiHeader apiHeader) {
        mApiHeader = apiHeader;
    }

    @Override
    public Single<LoginResponse> doFacebookLoginApiCall(LoginRequest.FacebookLoginRequest request) {
        return Rx2AndroidNetworking.post(ApiEndPoint.ENDPOINT_FACEBOOK_LOGIN)
                .addHeaders(mApiHeader.getPublicApiHeader())
                .addBodyParameter(request)
                .build()
                .getObjectSingle(LoginResponse.class);
    }

    @Override
    public Single<LoginResponse> doGoogleLoginApiCall(LoginRequest.GoogleLoginRequest request) {
        return Rx2AndroidNetworking.post(ApiEndPoint.ENDPOINT_GOOGLE_LOGIN)
                .addHeaders(mApiHeader.getPublicApiHeader())
                .addBodyParameter(request)
                .build()
                .getObjectSingle(LoginResponse.class);
    }

    @Override
    public Single<LogoutResponse> doLogoutApiCall() {
        return Rx2AndroidNetworking.post(ApiEndPoint.ENDPOINT_LOGOUT)
                .addHeaders(mApiHeader.getProtectedApiHeader())
                .build()
                .getObjectSingle(LogoutResponse.class);
    }

    @Override
    public Single<LoginResponse> doServerLoginApiCall(LoginRequest.ServerLoginRequest request) {
        return Rx2AndroidNetworking.post(ApiEndPoint.ENDPOINT_SERVER_LOGIN)
                .addHeaders(mApiHeader.getPublicApiHeader())
                .addBodyParameter(request)
                .build()
                .getObjectSingle(LoginResponse.class);
    }

    @Override
    public ApiHeader getApiHeader() {
        return mApiHeader;
    }

    @Override
    public Single<BlogResponse> getBlogApiCall() {
        return Rx2AndroidNetworking.get(ApiEndPoint.ENDPOINT_BLOG)
                .addHeaders(mApiHeader.getProtectedApiHeader())
                .build()
                .getObjectSingle(BlogResponse.class);
    }

    @Override
    public Single<OpenSourceResponse> getOpenSourceApiCall(int page) {
        String apiEndPoint = ApiEndPoint.ENDPOINT_OPEN_SOURCE_PAGE_ONE;
        switch (page) {
            case 1:
                apiEndPoint = ApiEndPoint.ENDPOINT_OPEN_SOURCE_PAGE_ONE;
                break;
            case 2:
                apiEndPoint = ApiEndPoint.ENDPOINT_OPEN_SOURCE_PAGE_TWO;
                break;
            case 3:
                apiEndPoint = ApiEndPoint.ENDPOINT_OPEN_SOURCE_PAGE_THREE;
                break;
        }
        return Rx2AndroidNetworking.get(apiEndPoint)
                .addHeaders(mApiHeader.getProtectedApiHeader())
                .build()
                .getObjectSingle(OpenSourceResponse.class);
    }
}