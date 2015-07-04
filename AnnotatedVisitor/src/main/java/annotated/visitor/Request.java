package annotated.visitor;

/**
 * Created by Thomas on 7/3/2015.
 */
public final class Request {
    private final String[] requests;
    private final Operator operation;

    public Request(Operator operation, String ... requests) {
        this.requests = requests;
        this.operation = operation;
    }

    public String[] getRequests() {
        return requests;
    }

    public Operator getOperation() {
        return operation;
    }
}
