package com.example.goms_android_v2_admin.utils


import android.util.Log
import com.goms.domain.exception.ConflictDataException
import com.goms.domain.exception.ExpiredTokenException
import com.goms.domain.exception.ForBiddenException
import com.goms.domain.exception.InvalidTokenException
import com.goms.domain.exception.NotFoundException
import com.goms.domain.exception.ServerErrorException
import com.goms.domain.exception.TooManyRequestException
import com.goms.domain.exception.WrongDataException

suspend fun<T> Throwable.errorHandling(
unknownAction: suspend () -> Unit,
wrongDataException: suspend () -> Unit = unknownAction,
invalidTokenException: suspend () -> Unit = unknownAction,
notFoundException: suspend () -> Unit = unknownAction,
conflictException: suspend () -> Unit = unknownAction,
serverErrorException: suspend () -> Unit = unknownAction,
expiredTokenException: suspend () -> Unit = unknownAction,
tooManyRequestException: suspend () -> Unit = unknownAction,
forBiddenException: suspend() -> Unit = unknownAction,
): Event<T> =
    when (this) {
    is WrongDataException -> {
        errorLog("WrongDataException", message)
        wrongDataException()
        Event.BadRequest
    }

    is InvalidTokenException -> {
        errorLog("InvalidTokenException", message)
        invalidTokenException()
        Event.Unauthorized
    }

    is NotFoundException -> {
        errorLog("NotFoundException", message)
        notFoundException()
        Event.NotFound
    }

    is ForBiddenException -> {
        errorLog("ForbiddenExceptiom", message)
        forBiddenException()
        Event.ForBidden
    }
    is ConflictDataException -> {
        errorLog("ConflictDataException", message)
        conflictException()
        Event.Conflict
    }

    is ServerErrorException -> {
        errorLog("ServerErrorException", message)
        serverErrorException()
        Event.Server
    }

    is ExpiredTokenException -> {
        errorLog("ExpiredTokenException", message)
        expiredTokenException()
        Event.TokenExpired
    }

    is TooManyRequestException -> {
        errorLog("TooManyRequestException", message)
        tooManyRequestException()
        Event.ManyRequest
    }

    else -> {
        errorLog("UnKnownException", message)
        unknownAction()
        Event.UnKnown
    }
}

private fun errorLog(tag: String, msg: String?) {
    Log.e(tag, msg ?: "")
}
