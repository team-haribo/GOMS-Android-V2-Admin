package com.goms.data.remote.dto.auth.response

import com.goms.domain.model.auth.response.AccessValidationResponseModel

data class AccessValidationResponse(
    val isExist: Boolean
)

fun AccessValidationResponse.toModel() =
    AccessValidationResponseModel(
        isExist = this.isExist
    )
