package com.goms.domain.usecase.auth

import com.goms.domain.model.auth.request.GAuthLoginRequestModel
import com.goms.domain.repository.AuthRepository
import javax.inject.Inject

class GAuthLoginUseCase @Inject constructor(
    private val authRepository: AuthRepository
) {
    suspend operator fun invoke(body: GAuthLoginRequestModel) = kotlin.runCatching {
        authRepository.gAuthLogin(body = body)
    }
}