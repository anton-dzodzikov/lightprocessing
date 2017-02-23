package solutions.lightprocessing.storage.fs.repository

import groovy.util.logging.Slf4j
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import solutions.lightprocessing.storage.fs.domain.OperationType
import solutions.lightprocessing.storage.fs.reader.OperationTypeReader

import javax.annotation.PostConstruct

@Slf4j
@Service
class OperationTypeRepository {
    Map<String, OperationType> operationTypes

    @Autowired
    OperationTypeReader operationTypesReader

    @PostConstruct
    void setUpTypes() {
        operationTypes = operationTypesReader.readTypesFromFilesystem()
    }

    Set<String> listTypes() {
        operationTypes.keySet()
    }

    List<OperationType> getAllTypes() {
        operationTypes.values().asList()
    }

    OperationType getByName(String name) {
        operationTypes.get(name).with {
            if (it == null) {
                log.warn("Failed attempt to get operation type with name $name")
                throw new IllegalArgumentException("There is no operation type with name $name")
            } else {
                it
            }
        }
    }
}
