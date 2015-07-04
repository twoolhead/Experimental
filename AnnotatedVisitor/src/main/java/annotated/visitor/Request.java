package annotated.visitor;

import annotated.operations.ArithmeticOperator;

/**
 * Created by Thomas on 7/3/2015.
 */
public final class Request {
    private final String[] requests;
    private final ArithmeticOperator operation;

    public Request(ArithmeticOperator operation, String ... requests) {
        this.requests = requests;
        this.operation = operation;
    }

    public String[] getRequests() {
        return requests;
    }

    public ArithmeticOperator getOperation() {
        return operation;
    }
}
