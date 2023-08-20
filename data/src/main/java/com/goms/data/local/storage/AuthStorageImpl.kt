package com.goms.data.local.storage

import android.content.SharedPreferences
import javax.inject.Inject

class AuthStorageImpl @Inject constructor(
    private val sharedPreferences: SharedPreferences
) : AuthStorage {
    companion object {
        const val ACCESS_TOKEN = "ACCESS_TOKEN"
        const val REFRESH_TOKEN = "REFRESH_TOKEN"
    }
    override fun setAccessToken(access: String?) =
        setData(ACCESS_TOKEN, access)
    override fun getAccessToken(): String? =
        sharedPreferences.getString(ACCESS_TOKEN, "")

    override fun setRefreshToken(refresh: String?) =
        setData(REFRESH_TOKEN, refresh)
    override fun getRefreshToken(): String? =
        sharedPreferences.getString(REFRESH_TOKEN, "")


    private fun setData(id: String, data: String?) {
        sharedPreferences.edit().let {
            it.putString(id, data)
            it.apply()
        }
    }

}