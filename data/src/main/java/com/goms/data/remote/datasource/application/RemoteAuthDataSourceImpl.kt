package com.goms.data.remote.datasource.application

import com.goms.data.remote.api.AuthAPI
import com.goms.data.remote.dto.auth.request.GAuthLoginRequest
import com.goms.data.remote.dto.auth.response.GAuthLoginResponse
import com.goms.data.utils.GomsApiHandler
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOn
import javax.inject.Inject

class RemoteAuthDataSourceImpl @Inject constructor(
    private val service: AuthAPI
) : RemoteAuthDataSource {
    override suspend fun gAuthLogin(body: GAuthLoginRequest): Flow<GAuthLoginResponse> = flow {
        emit(
          GomsApiHandler<GAuthLoginResponse>()
              .httpRequest { service.gAuthLogin(body = body) }
              .sendRequest()
        )
    }.flowOn(Dispatchers.IO)

    override suspend fun refreshToken(refreshToken: String): Flow<GAuthLoginResponse> {
        TODO("Not yet implemented")
    }

}