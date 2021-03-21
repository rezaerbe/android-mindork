package com.erbe.jetpack.data.remote;

import com.erbe.jetpack.data.model.api.BlogResponse;
import com.erbe.jetpack.data.model.api.LoginRequest;
import com.erbe.jetpack.data.model.api.LoginResponse;
import com.erbe.jetpack.data.model.api.LogoutResponse;
import com.erbe.jetpack.data.model.api.OpenSourceResponse;

import io.reactivex.Single;

public interface ApiHelper {

    Single<LoginResponse> doFacebookLoginApiCall(LoginRequest.FacebookLoginRequest request);

    Single<LoginResponse> doGoogleLoginApiCall(LoginRequest.GoogleLoginRequest request);

    Single<LogoutResponse> doLogoutApiCall();

    Single<LoginResponse> doServerLoginApiCall(LoginRequest.ServerLoginRequest request);

    ApiHeader getApiHeader();

    Single<BlogResponse> getBlogApiCall();

    Single<OpenSourceResponse> getOpenSourceApiCall(int page);
}