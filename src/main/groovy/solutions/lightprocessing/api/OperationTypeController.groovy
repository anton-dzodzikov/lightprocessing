package solutions.lightprocessing.api

import solutions.lightprocessing.api.response.SingleResult
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.ResponseBody
import solutions.lightprocessing.repository.OperationTypeRepository

@Controller
@RequestMapping("api/operations")
class OperationTypeController {
    @Autowired
    OperationTypeRepository operationTypeRepository

    @ResponseBody
    @RequestMapping(value = "names", produces = "application/json")
    SingleResult getNamesList() {
        [ operationTypeRepository.listTypes() ]
    }

    @ResponseBody
    @RequestMapping(value = "all", produces = "application/json")
    SingleResult getAllTypes() {
        [ operationTypeRepository.getAllTypes() ]
    }

    @ResponseBody
    @RequestMapping(value = "{name}", produces = "application/json")
    SingleResult getTypeByName(@PathVariable("name") String name) {
        [ operationTypeRepository.getByName(name) ]
    }
}
