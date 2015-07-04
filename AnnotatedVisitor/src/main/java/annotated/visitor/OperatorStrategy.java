package annotated.visitor;

/**
 * Created by Thomas on 7/3/2015.
 */
public class OperatorStrategy implements IValidator, IStrategy{

    @Override
    public String executeStrategy(Message message) {
        final Request request = message.getRequests();
        if (this.validate(request)) {
        }
        return "";
    }

    @Override
    public boolean validate(Request request) {
        final Operator requestOperation = request.getOperation();
        for(Operator operation: Operator.values()) {
            if(operation.equals(requestOperation)){
                return true;
            }
        }
        return false;
    }
}
