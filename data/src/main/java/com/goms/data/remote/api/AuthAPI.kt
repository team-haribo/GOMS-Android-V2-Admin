package com.goms.data.remote.api

import com.goms.data.remote.dto.auth.request.GAuthLoginRequest
import com.goms.data.remote.dto.auth.response.GAuthLoginResponse
import retrofit2.http.Body
import retrofit2.http.Header
import retrofit2.http.PATCH
import retrofit2.http.POST

interface AuthAPI {

    @POST("/api/v2/auth/signin")
    suspend fun gAuthLogin(
        @Body body: GAuthLoginRequest
    ): GAuthLoginResponse

    @PATCH("/api/v2/auth")
    suspend fun provideRefershToken(
        @Header("refreshToken") refreshToken: String
    ): GAuthLoginResponse
}