package com.goms.domain.model.auth.response

data class GAuthLoginResponseModel(
    val accessToken: String,
    val refreshToken: String,
    val accessTokenExp: String,
    val refreshTokenExp: String,
    val authority: String,
)
