package com.goms.data.local.storage

import android.content.SharedPreferences
import javax.inject.Inject

class AuthStorageImpl @Inject constructor(
    private val sharedPreferences: SharedPreferences
) : AuthStorage {
    companion object {
        const val TOKEN = "TOKEN"
        const val ACCESS_TOKEN = "ACCESS_TOKEN"
        const val REFRESH_TOKEN = "REFRESH_TOKEN"
        const val ACCESS_TOKEN_EXPIRED_AT = "ACCESS_TOKEN_EXPIRED_AT"
        const val REFRESH_TOKEN_EXPIRED_AT = "REFRESH_TOKEN_EXPIRED_AT"
    }
    override fun setAccessToken(access: String?) =
        setData(ACCESS_TOKEN, access)
    override fun getAccessToken(): String? =
        sharedPreferences.getString(ACCESS_TOKEN, "")

    override fun setRefreshToken(refresh: String?) =
        setData(REFRESH_TOKEN, refresh)
    override fun getRefreshToken(): String? =
        sharedPreferences.getString(REFRESH_TOKEN, "")

    override fun getAccessTokenExpiredAt(): String? =
        sharedPreferences.getString(ACCESS_TOKEN_EXPIRED_AT, "")


    override fun setAccessTokenExpiredAt(accessTokenExpiredAt: String?) =
        setData(ACCESS_TOKEN_EXPIRED_AT, accessTokenExpiredAt)


    override fun getRefreshTokenExpiredAt(): String? =
        sharedPreferences.getString(REFRESH_TOKEN_EXPIRED_AT, "")


    override fun setRefreshTokenExpiredAt(refreshTokenExpiredAt: String?) =
        setData(REFRESH_TOKEN_EXPIRED_AT, refreshTokenExpiredAt)



    private fun setData(id: String, data: String?) {
        sharedPreferences.edit().let {
            it.putString(id, data)
            it.apply()
        }
    }

}
