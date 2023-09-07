package com.goms.data.remote.dto.auth.response

import com.goms.domain.model.auth.response.GAuthLoginResponseModel

data class GAuthLoginResponse(
    val accessToken: String,
    val refreshToken: String,
    val accessTokenExp: String?,
    val refreshTokenExp: String?,
    val authority: String,
)

fun GAuthLoginResponse.toLoginModel() =
    GAuthLoginResponseModel(
        accessToken = this.accessToken,
        refreshToken = this.refreshToken,
        accessTokenExp = this.accessTokenExp,
        refreshTokenExp = this.refreshTokenExp,
        authority = this.authority,
    )