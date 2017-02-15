package com.cardpay.backoffice.service.operations.repository.api.response

class SingleResult {
    Status status = Status.SUCCESS
    Object body

    SingleResult(Object body) {
        this.body = body
    }
}
