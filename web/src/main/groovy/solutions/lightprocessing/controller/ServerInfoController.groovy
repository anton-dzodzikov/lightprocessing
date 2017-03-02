package solutions.lightprocessing.controller

import org.springframework.stereotype.Controller

import javax.ws.rs.GET
import javax.ws.rs.Path

@Controller
@Path("/info")
class ServerInfoController {
    @GET
    String version() {
        return "dev";
    }
}
