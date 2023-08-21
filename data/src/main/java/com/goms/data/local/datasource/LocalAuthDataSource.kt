package com.goms.data.local.datasource

interface LocalAuthDataSource {
    suspend fun getAccessToken(): String?
    suspend fun getRefreshToken(): String?
    suspend fun getExpiredAt(): String?
    suspend fun saveToken(access: String?, refresh: String?,expiredAt: String?)
}