package com.cubetiqs.relationshipapp.exception

import com.fasterxml.jackson.annotation.JsonFormat
import java.time.LocalDateTime

data class ExceptionResponse(

    val message: String,
    val code: String,
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyyy hh-mm-ss")
    val time: LocalDateTime

)
