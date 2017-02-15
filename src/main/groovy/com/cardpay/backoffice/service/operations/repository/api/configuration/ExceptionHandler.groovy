package com.cardpay.backoffice.service.operations.repository.api.configuration

import com.cardpay.backoffice.service.operations.repository.api.response.ExceptionResult
import org.springframework.web.bind.annotation.ControllerAdvice

@ControllerAdvice
class ExceptionHandler {
    ExceptionResult defaultErrorHandler(Exception e) {
        [ body: e.message ]
    }
}
