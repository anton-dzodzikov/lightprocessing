package solutions.lightprocessing.component

import solutions.lightprocessing.model.OperationType

interface OperationTypeProvider {
    Collection<OperationType> getAllOperations()
}
