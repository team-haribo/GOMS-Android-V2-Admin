package com.goms.data.local.datasource

import com.goms.data.local.storage.AuthStorage
import javax.inject.Inject

class LocalAuthDataSourceImpl @Inject constructor(
    private val localStorage: AuthStorage
) : LocalAuthDataSource {
    override suspend fun getAccessToken(): String? =
        localStorage.getAccessToken()

    override suspend fun getRefreshToken(): String? =
        localStorage.getRefreshToken()



    override suspend fun saveToken(
        access: String?,
        refresh: String?,
        refreshTokenExpiredAt: String?,
        accessTokenExpiredAt: String?
    ) =
        localStorage.run {
            setAccessToken(access)
            setRefreshToken(refresh)
            setRefreshTokenExpiredAt(refreshTokenExpiredAt)
            setAccessTokenExpiredAt(accessTokenExpiredAt)
        }

    override suspend fun getAccessTokenExpiredAt(): String? =
        localStorage.getAccessTokenExpiredAt()

    override suspend fun getRefreshTokenExpiredAt(): String? =
        localStorage.getRefreshTokenExpiredAt()

}