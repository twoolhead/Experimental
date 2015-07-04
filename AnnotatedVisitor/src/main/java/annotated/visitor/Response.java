package annotated.visitor;

/**
 * Created by Thomas on 7/3/2015.
 */
public final class Response {
    private final String[] responses;
    private final Request request;
    private final Result result;

    public Response(Request request, Result result, String ... responses) {
        this.request = request;
        this.responses = responses;
        this.result = result;
    }

    public String[] getResponses() {
        return responses;
    }

    public Request getRequest() {
        return request;
    }

    public Result getResult() {
        return result;
    }
}
