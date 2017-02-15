package com.cardpay.backoffice.service.operations.repository.reader

import com.cardpay.backoffice.service.operations.repository.domain.OperationType
import org.springframework.stereotype.Component

@Component
class OperationTypeReader {
    Map<String, OperationType> readTypesFromFilesystem() {
        [:]
    }
}
