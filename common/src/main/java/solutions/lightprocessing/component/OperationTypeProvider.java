package solutions.lightprocessing.component;


import solutions.lightprocessing.model.OperationType;

import java.util.Collection;

public interface OperationTypeProvider {
    public Collection<OperationType> getAllOperations();
}
