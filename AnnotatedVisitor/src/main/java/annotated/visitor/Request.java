package annotated.visitor;

import annotated.operations.StringOperator;

/**
 * Created by Thomas on 7/3/2015.
 */
public final class Request {
    private final String request;
    private final StringOperator[] operation;

    public Request(String request, StringOperator ... operation) {
        this.request = request;
        this.operation = operation;
    }

    public String getRequest() {
        return request;
    }

    public StringOperator[] getOperation() {
        return operation;
    }
}
