package com.goms.data.local.key

import androidx.datastore.preferences.core.stringPreferencesKey

object AuthPreferenceKey {

    val ACCESS_TOKEN = stringPreferencesKey("access_token")

    val ACCESS_TOKEN_EXPIRED_AT = stringPreferencesKey("access_token_expired_at")

    val REFRESH_TOKEN = stringPreferencesKey("refresh_token")

    val REFRESH_TOKEN_EXPIRED_AT = stringPreferencesKey("refresh_token_expired_at")
}