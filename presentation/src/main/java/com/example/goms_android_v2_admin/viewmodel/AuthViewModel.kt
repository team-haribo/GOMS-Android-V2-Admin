package com.example.goms_android_v2_admin.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.goms_android_v2_admin.utils.Event
import com.example.goms_android_v2_admin.utils.errorHandling
import com.goms.domain.model.auth.request.GAuthLoginRequestModel
import com.goms.domain.model.auth.response.AccessValidationResponseModel
import com.goms.domain.model.auth.response.GAuthLoginResponseModel
import com.goms.domain.usecase.auth.DeleteTokenUseCase
import com.goms.domain.usecase.auth.GAuthLoginUseCase
import com.goms.domain.usecase.auth.SaveTheLoginDataUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.catch
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class AuthViewModel @Inject constructor(
    private val gAuthLoginUseCase: GAuthLoginUseCase,
    private val saveTheLoginDataUseCase: SaveTheLoginDataUseCase,
    private val deleteTokenUseCase: DeleteTokenUseCase,
) : ViewModel(){
    private val _gAuthLoginRequest = MutableLiveData<Event<GAuthLoginResponseModel>>()
    val gAuthLoginRequest: LiveData<Event<GAuthLoginResponseModel>> get() = _gAuthLoginRequest

    private val _accessValidationResponse =
        MutableStateFlow<Event<AccessValidationResponseModel>>(Event.Loading)
    val accessValidationResponse = _accessValidationResponse.asStateFlow()

    fun gAuthLogin(code: String) = viewModelScope.launch {
        gAuthLoginUseCase(
            GAuthLoginRequestModel(code = code)
        ).onSuccess {
            it.catch { remoteError ->
                _gAuthLoginRequest.value = remoteError.errorHandling(unknownAction = { saveTheLoginDataUseCase})
            }.collect {response ->
                _gAuthLoginRequest.value = Event.Success(data = response)
            }
        }.onFailure {
            _gAuthLoginRequest.value = it.errorHandling(unknownAction = { saveTheLoginDataUseCase})
        }
    }

    fun deleteToken() = viewModelScope.launch {
        deleteTokenUseCase()
    }
}