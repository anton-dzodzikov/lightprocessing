package solutions.lightprocessing.api.configuration

import org.springframework.web.bind.annotation.ControllerAdvice
import org.springframework.web.bind.annotation.ExceptionHandler
import org.springframework.web.bind.annotation.ResponseBody
import solutions.lightprocessing.api.response.ExceptionResult

@ControllerAdvice
class ExceptionConfiguration {
    @ResponseBody
    @ExceptionHandler(Exception.class)
    ExceptionResult defaultErrorHandler(Exception e) {
        [ body: e.message ]
    }
}
