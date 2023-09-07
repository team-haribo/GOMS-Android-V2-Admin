package com.goms.data.local.datasource

import kotlinx.coroutines.flow.Flow

interface LocalAuthDataSource {

    // AccessToken
    suspend fun getAccessToken(): Flow<String>
    suspend fun setAccessToken(accessToken: String)
    suspend fun removeAccessToken()

    // RefreshToken
    suspend fun getRefreshToken(): Flow<String>
    suspend fun setRefreshToken(refreshToken: String)
    suspend fun removeRefreshToken()

    // AccessExpiredAt
    suspend fun getAccessTokenExpiredAt(): Flow<String>
    suspend fun setAccessTokenExpiredAt(accessTokenExpiredAt: String)
    suspend fun removeAccessExpiredAt()

    // RefreshExpiredAt
    suspend fun getRefreshTokenExpiredAt():Flow<String>
    suspend fun setRefreshTokenExpiredAt(refreshTokenExpiredAt: String)
    suspend fun removeRefreshExpiredAt()
}