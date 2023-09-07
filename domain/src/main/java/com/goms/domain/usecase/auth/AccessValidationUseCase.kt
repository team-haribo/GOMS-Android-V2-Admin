package com.goms.domain.usecase.auth

import com.goms.domain.repository.AuthRepository
import javax.inject.Inject

class AccessValidationUseCase @Inject constructor(
    private val authRepository: AuthRepository
) {
    suspend operator fun invoke() = kotlin.runCatching {
        authRepository.accessValidation()
    }
}