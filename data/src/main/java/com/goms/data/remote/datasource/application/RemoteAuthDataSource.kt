package com.goms.data.remote.datasource.application

import com.goms.data.remote.dto.auth.request.GAuthLoginRequest
import com.goms.data.remote.dto.auth.response.AccessValidationResponse
import com.goms.data.remote.dto.auth.response.GAuthLoginResponse
import kotlinx.coroutines.flow.Flow

interface RemoteAuthDataSource {
    suspend fun gAuthLogin(body: GAuthLoginRequest): Flow<GAuthLoginResponse>

    suspend fun accessValidation(): Flow<AccessValidationResponse>

    suspend fun logout(): Flow<Unit>

    suspend fun withdrawal(): Flow<Unit>
}