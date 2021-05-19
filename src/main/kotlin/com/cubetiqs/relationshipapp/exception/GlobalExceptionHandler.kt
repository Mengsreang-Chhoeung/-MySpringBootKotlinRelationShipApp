package com.cubetiqs.relationshipapp.exception

import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.ControllerAdvice
import org.springframework.web.bind.annotation.ExceptionHandler
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler
import java.time.LocalDateTime

@ControllerAdvice
class GlobalExceptionHandler : ResponseEntityExceptionHandler() {

    @ExceptionHandler(value = [(ResourceNotFound::class)])
    fun resourceNotFound(exception: ResourceNotFound): ResponseEntity<ExceptionResponse> {
        val response = ExceptionResponse("NOT_FOUND", exception.localizedMessage, LocalDateTime.now())
        return ResponseEntity<ExceptionResponse>(response, HttpStatus.NOT_FOUND)
    }

    @ExceptionHandler(value = [(ResourceAlreadyExists::class)])
    fun resourceAlreadyExists(exception: ResourceAlreadyExists): ResponseEntity<ExceptionResponse> {
        val response = ExceptionResponse("CONFLICT", exception.localizedMessage, LocalDateTime.now())
        return ResponseEntity<ExceptionResponse>(response, HttpStatus.CONFLICT)
    }

    @ExceptionHandler(value = [(CustomException::class)])
    fun customException(exception: CustomException): ResponseEntity<ExceptionResponse> {
        val response = ExceptionResponse("BAD_REQUEST", exception.localizedMessage, LocalDateTime.now())
        return ResponseEntity<ExceptionResponse>(response, HttpStatus.BAD_REQUEST)
    }

    @ExceptionHandler(value = [(UnauthorizedException::class)])
    fun unauthorizedException(exception: UnauthorizedException): ResponseEntity<ExceptionResponse> {
        val response = ExceptionResponse("UNAUTHORIZED", exception.localizedMessage, LocalDateTime.now())
        return ResponseEntity<ExceptionResponse>(response, HttpStatus.UNAUTHORIZED)
    }

    @ExceptionHandler(value = [(SuccessException::class)])
    fun successException(exception: SuccessException): ResponseEntity<ExceptionResponse> {
        val response = ExceptionResponse("SUCCESS", exception.localizedMessage, LocalDateTime.now())
        return ResponseEntity<ExceptionResponse>(response, HttpStatus.OK)
    }

}