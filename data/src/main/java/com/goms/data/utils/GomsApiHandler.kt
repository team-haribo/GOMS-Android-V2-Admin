package com.goms.data.utils

import com.goms.domain.exception.BadRequestException
import com.goms.domain.exception.ConflictDataException
import com.goms.domain.exception.ForBiddenException
import com.goms.domain.exception.InvalidTokenException
import com.goms.domain.exception.NeedLoginException
import com.goms.domain.exception.NetworkException
import com.goms.domain.exception.NotFoundException
import com.goms.domain.exception.ServerErrorException
import com.goms.domain.exception.TimeOutException
import com.goms.domain.exception.UnKnownHttpException
import com.goms.domain.exception.UnknownException
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import retrofit2.HttpException
import java.net.SocketTimeoutException
import java.net.UnknownHostException

class GomsApiHandler<T> {
    private lateinit var httpRequest: suspend () -> T

    fun httpRequest(httpRequest: suspend () -> T) =
        this.apply { this.httpRequest = httpRequest }

    suspend fun sendRequest(): T {
        return try {
            withContext(Dispatchers.IO) {
                httpRequest.invoke()
            }
        } catch (e: HttpException) {
            val message = e.message
            throw when(e.code()){
                400 -> BadRequestException(
                    message = message
                )
                401 -> InvalidTokenException(
                    message = message
                )
                403 -> ForBiddenException(
                    message = message
                )
                404 -> NotFoundException(
                    message = message
                )
                409 -> ConflictDataException(
                    message = message
                )
                500, 501, 502, 503 -> ServerErrorException(
                    message = message
                )
                else -> UnKnownHttpException(
                    message = message,
                )
            }
        } catch (e: SocketTimeoutException) {
            throw TimeOutException(message = e.message)
        } catch (e: UnknownHostException) {
            throw NetworkException()
        } catch (e: NeedLoginException) {
            throw NeedLoginException(message = e.message)
        } catch (e: Exception) {
            throw UnknownException(message = e.message)
        }
    }
}