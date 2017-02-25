package solutions.lightprocessing.controller

import org.springframework.stereotype.Component

import javax.ws.rs.GET
import javax.ws.rs.Path

@Component
@Path("/info")
class ServerInfoController {
    @GET
    def version() {
        return "dev";
    }
}
