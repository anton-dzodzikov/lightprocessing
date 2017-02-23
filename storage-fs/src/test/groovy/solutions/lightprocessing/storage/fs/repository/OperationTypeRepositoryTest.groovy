package solutions.lightprocessing.storage.fs.repository

import org.testng.annotations.Test
import solutions.lightprocessing.storage.fs.domain.OperationType
import solutions.lightprocessing.storage.fs.reader.OperationTypeReader

import static org.mockito.Mockito.mock
import static org.mockito.Mockito.when
import static org.testng.Assert.assertEquals

class OperationTypeRepositoryTest {
    @Test
    void loadsTypesOnInitialization() {
        // given
        OperationTypeRepository operationTypeRepository = new OperationTypeRepository()
        operationTypeRepository.operationTypesReader = mock(OperationTypeReader.class)

        OperationType type1 = new OperationType(
                name: "TYPE_ONE",
                description: "Test operation one"
        )

        OperationType type2 = new OperationType(
                name: "TYPE_TWO",
                description: "Test operation two"
        )

        // when
        when(operationTypeRepository.operationTypesReader.readTypesFromFilesystem())
                .thenReturn(["TYPE_ONE": type1, "TYPE_TWO": type2])

        // then
        operationTypeRepository.setUpTypes()

        assertEquals(operationTypeRepository.operationTypes, ["TYPE_ONE": type1, "TYPE_TWO": type2])
    }
}
