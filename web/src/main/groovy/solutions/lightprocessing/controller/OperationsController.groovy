package solutions.lightprocessing.controller

import org.springframework.stereotype.Component
import solutions.lightprocessing.component.OperationTypeProvider

import javax.ws.rs.GET
import javax.ws.rs.Path

@Component
@Path("/operation")
class OperationsController {


    List<OperationTypeProvider> providers;

    @GET
    // TODO: it's not working yet. We need to inject all OperationTypeProvider beans available in classpath
    getListOfOperations() {
        providers.allOperations.flatten()
    }
}
