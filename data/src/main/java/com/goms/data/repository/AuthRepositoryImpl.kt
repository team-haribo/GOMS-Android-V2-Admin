package com.goms.data.repository

import com.goms.data.local.datasource.LocalAuthDataSource
import com.goms.data.remote.datasource.application.RemoteAuthDataSource
import com.goms.data.remote.dto.auth.request.GAuthLoginRequest
import com.goms.data.remote.dto.auth.response.toLoginModel
import com.goms.domain.model.auth.request.GAuthLoginRequestModel
import com.goms.domain.model.auth.response.AccessValidationResponseModel
import com.goms.domain.model.auth.response.GAuthLoginResponseModel
import com.goms.domain.repository.AuthRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map
import javax.inject.Inject

class AuthRepositoryImpl @Inject constructor(
    private val remoteDataSource: RemoteAuthDataSource,
    private val localDataSource: LocalAuthDataSource,
) : AuthRepository {
    override suspend fun gAuthLogin(body: GAuthLoginRequestModel): Flow<GAuthLoginResponseModel> {
        return remoteDataSource.gAuthLogin(
            body = GAuthLoginRequest(
                code = body.code
            )
        ).map { it.toLoginModel() }
    }

    override suspend fun saveTheLoginData(data: GAuthLoginResponseModel) {
        data.let {
            localDataSource.setAccessToken(it.accessToken)
        }
    }

    override suspend fun accessValidation(): Flow<AccessValidationResponseModel> {
        TODO("Not yet implemented")
    }

    override suspend fun logout(): Flow<Unit> {
        TODO("Not yet implemented")
    }

    override suspend fun withdrawal(): Flow<Unit> {
        TODO("Not yet implemented")
    }

    override suspend fun deleteLoginData() {
        TODO("Not yet implemented")
    }

}