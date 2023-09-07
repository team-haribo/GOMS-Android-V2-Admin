package com.goms.domain.repository

import com.goms.domain.model.auth.request.GAuthLoginRequestModel
import com.goms.domain.model.auth.response.AccessValidationResponseModel
import com.goms.domain.model.auth.response.GAuthLoginResponseModel
import kotlinx.coroutines.flow.Flow

interface AuthRepository {
    suspend fun gAuthLogin(body: GAuthLoginRequestModel): Flow<GAuthLoginResponseModel>
    suspend fun saveTheLoginData(data: GAuthLoginResponseModel)
    suspend fun accessValidation(): Flow<AccessValidationResponseModel>
}