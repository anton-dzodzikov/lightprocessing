package solutions.lightprocessing.storage.fs.reader

import groovy.json.JsonSlurper
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.core.io.ResourceLoader
import solutions.lightprocessing.storage.fs.domain.OperationType

class OperationTypeReader {
    final String pathToOperations

    @Autowired
    ResourceLoader resourceLoader

    OperationTypeReader(String pathToOperations) {
        this.pathToOperations = pathToOperations
    }

    Map<String, OperationType> readTypesFromFilesystem() {
        resourceLoader.getResource(pathToOperations).file.listFiles()
                .collectEntries {[ it.name, buildType(it) ]}
    }

    // TODO: Validate that folder contents all files named right
    OperationType buildType(File typeFolder) {
        typeFolder.listFiles()
                .find { it.name == "properties.json" }
                .getText()
                .with { new JsonSlurper().parseText(it) as Map }
                .with { properties -> [
                    name: typeFolder.name,
                    description: properties.description,
                    language: properties.language,
                    executable: properties.executable as Boolean,
                    restartable: properties.restartable as Boolean,
                    enrollScript: typeFolder.listFiles()
                            .find { it.name == "enroll.groovy" }
                            .getText(),
                    rollbackScript: typeFolder.listFiles()
                            .find { it.name == "rollback.groovy" }
                            .getText()
                ]}
                .with { new OperationType(it) }
    }
}
