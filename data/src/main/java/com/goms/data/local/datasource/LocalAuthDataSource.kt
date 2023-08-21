package com.goms.data.local.datasource

interface LocalAuthDataSource {
    suspend fun getAccessToken(): String?
    suspend fun getRefreshToken(): String?
    suspend fun saveToken(access: String?, refresh: String?, refreshTokenExpiredAt: String?, accessTokenExpiredAt: String?)
    suspend fun getAccessTokenExpiredAt(): String?
    suspend fun getRefreshTokenExpiredAt(): String?
}