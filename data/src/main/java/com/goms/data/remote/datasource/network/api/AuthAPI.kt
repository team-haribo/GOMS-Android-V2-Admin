package com.goms.data.remote.datasource.network.api

import com.goms.data.remote.dto.auth.request.GAuthLoginRequest
import com.goms.data.remote.dto.auth.response.AccessValidationResponse
import com.goms.data.remote.dto.auth.response.GAuthLoginResponse
import retrofit2.http.Body
import retrofit2.http.DELETE
import retrofit2.http.GET
import retrofit2.http.POST

interface AuthAPI {
    @POST("/api/v2/auth")
    suspend fun gAuthLogin(
        @Body body: GAuthLoginRequest
    ): GAuthLoginResponse

    @GET("auth/verify/access")
    suspend fun accessValidation(): AccessValidationResponse

    @DELETE("auth")
    suspend fun logout()

    @DELETE("auth/withdrawal")
    suspend fun withdrawal()

}