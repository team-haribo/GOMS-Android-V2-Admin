package com.goms.domain.usecase.auth

import com.goms.domain.model.auth.response.GAuthLoginResponseModel
import com.goms.domain.repository.AuthRepository
import javax.inject.Inject

class SaveTheLoginDataUseCase @Inject constructor(
    private val authRepository: AuthRepository
){
    suspend operator fun invoke(data: GAuthLoginResponseModel) = runCatching {
        authRepository.saveTheLoginData(data)
    }
}