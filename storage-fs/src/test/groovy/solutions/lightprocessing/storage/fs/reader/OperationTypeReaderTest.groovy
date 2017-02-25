package solutions.lightprocessing.storage.fs.reader

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.test.context.ContextConfiguration
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests
import org.testng.annotations.Test
import solutions.lightprocessing.config.StorageFsTestConfiguration
import solutions.lightprocessing.storage.fs.domain.OperationType

import static org.testng.Assert.assertEquals

@ContextConfiguration(classes = StorageFsTestConfiguration.class)
class OperationTypeReaderTest extends AbstractTestNGSpringContextTests {
    @Autowired
    OperationTypeReader operationTypeReader

    @Test
    void readsTypesFromFilesystem() {
        Map<String, OperationType> loadedTypes = operationTypeReader.readTypesFromFilesystem()

        assertEquals(loadedTypes.size(), 2)
        assertEquals(loadedTypes.keySet(), ["SAY_HELLO", "RETURN_NUMBER_SEQUENCE"].toSet())
    }
}
