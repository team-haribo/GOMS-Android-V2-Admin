package com.goms.data.local.storage

interface AuthStorage {
    fun setAccessToken(access: String?)
    fun getAccessToken(): String?

    fun setRefreshToken(refresh: String?)
    fun getRefreshToken(): String?

    fun getAccessTokenExpiredAt(): String?
    fun setAccessTokenExpiredAt(expiredAt: String?)

    fun getRefreshTokenExpiredAt(): String?
    fun setRefreshTokenExpiredAt(expiredAt: String?)

}