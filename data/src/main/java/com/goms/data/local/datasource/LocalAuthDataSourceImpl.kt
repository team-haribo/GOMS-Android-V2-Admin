package com.goms.data.local.datasource

import androidx.datastore.core.DataStore
import com.goms.data.local.key.AuthPreferenceKey
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map
import java.util.prefs.Preferences
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
        TODO("Not yet implemented")
    }

    override suspend fun getRefreshToken(): String? =
        localStorage.getRefreshToken()

    override suspend fun setRefreshToken(refreshToken: String) {
        TODO("Not yet implemented")
    }

    override suspend fun removeRefreshToken() {
        TODO("Not yet implemented")
    }


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

    override suspend fun setAccessTokenExpiredAt(accessTokenExpiredAt: String) {
        TODO("Not yet implemented")
    }

    override suspend fun removeAccessExpiredAt() {
        TODO("Not yet implemented")
    }

    override suspend fun getRefreshTokenExpiredAt(): String? =
        localStorage.getRefreshTokenExpiredAt()

    override suspend fun setRefreshTokenExpiredAt(refreshTokenExpiredAt: String) {
        TODO("Not yet implemented")
    }

    override suspend fun removeRefreshExpiredAt() {
        TODO("Not yet implemented")
    }

}