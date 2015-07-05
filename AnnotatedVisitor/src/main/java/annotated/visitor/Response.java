package annotated.visitor;

/**
 * Created by Thomas on 7/3/2015.
 */
public final class Response {
    private final String[] responses;
    private final Result result;

    public Response(Result result, String ... responses) {
        this.responses = responses;
        this.result = result;
    }

    public String[] getResponses() {
        return responses;
    }

    public Result getResult() {
        return result;
    }

    @Override
    public String toString() {
        return "Response{}";
    }
}
