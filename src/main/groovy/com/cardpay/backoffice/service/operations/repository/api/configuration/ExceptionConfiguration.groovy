package com.cardpay.backoffice.service.operations.repository.api.configuration

import com.cardpay.backoffice.service.operations.repository.api.response.ExceptionResult
import org.springframework.web.bind.annotation.ControllerAdvice
import org.springframework.web.bind.annotation.ExceptionHandler
import org.springframework.web.bind.annotation.ResponseBody

@ControllerAdvice
class ExceptionConfiguration {
    @ResponseBody
    @ExceptionHandler(Exception.class)
    ExceptionResult defaultErrorHandler(Exception e) {
        [ body: e.message ]
    }
}
