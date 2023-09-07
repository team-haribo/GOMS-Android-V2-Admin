package com.goms.data.local.datasource

import androidx.datastore.core.DataStore
import androidx.datastore.preferences.core.Preferences
import androidx.datastore.preferences.core.edit
import com.goms.data.local.key.AuthPreferenceKey
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map

import javax.inject.Inject

class LocalAuthDataSourceImpl @Inject constructor(
    private val dataStore: DataStore<Preferences>
) : LocalAuthDataSource {

    override suspend fun getAccessToken(): Flow<String> = dataStore.data.map {
        it[AuthPreferenceKey.ACCESS_TOKEN] ?: ""
    }

    override suspend fun setAccessToken(accessToken: String) {
        dataStore.edit{
            it[AuthPreferenceKey.ACCESS_TOKEN] = accessToken
        }
    }

    override suspend fun removeAccessToken() {
        dataStore.edit {
            it.remove(AuthPreferenceKey.ACCESS_TOKEN)
        }
    }

    override suspend fun getAccessTokenExpiredAt(): Flow<String> = dataStore.data.map {
        it[AuthPreferenceKey.ACCESS_TOKEN_EXPIRED_AT] ?: ""
    }

    override suspend fun setAccessTokenExpiredAt(accessTokenExpiredAt: String) {
        dataStore.edit {
            it[AuthPreferenceKey.ACCESS_TOKEN_EXPIRED_AT] = accessTokenExpiredAt
        }
    }

    override suspend fun removeAccessExpiredAt() {
        dataStore.edit {
            it.remove(AuthPreferenceKey.ACCESS_TOKEN_EXPIRED_AT)
        }
    }

    override suspend fun getRefreshToken(): Flow<String> = dataStore.data.map {
        it[AuthPreferenceKey.REFRESH_TOKEN] ?: ""
    }

    override suspend fun setRefreshToken(refreshToken: String) {
        dataStore.edit {
            it[AuthPreferenceKey.REFRESH_TOKEN] = refreshToken
        }
    }

    override suspend fun removeRefreshToken() {
        dataStore.edit {
            it.remove(AuthPreferenceKey.REFRESH_TOKEN)
        }
    }
    override suspend fun getRefreshTokenExpiredAt(): Flow<String> = dataStore.data.map {
        it[AuthPreferenceKey.REFRESH_TOKEN_EXPIRED_AT] ?: ""
    }

    override suspend fun setRefreshTokenExpiredAt(refreshTokenExpiredAt: String) {
        dataStore.edit {
            it[AuthPreferenceKey.REFRESH_TOKEN_EXPIRED_AT] = refreshTokenExpiredAt
        }
    }

    override suspend fun removeRefreshExpiredAt() {
        dataStore.edit {
            it.remove(AuthPreferenceKey.REFRESH_TOKEN_EXPIRED_AT)
        }
    }

}