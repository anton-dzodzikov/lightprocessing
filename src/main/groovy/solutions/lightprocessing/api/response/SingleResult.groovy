package solutions.lightprocessing.api.response

class SingleResult {
    Status status = Status.SUCCESS
    Object body

    SingleResult(Object body) {
        this.body = body
    }
}
