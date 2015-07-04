package annotated.strategy;

import annotated.messages.Message;
import annotated.operations.ArithmeticOperator;
import annotated.strategy.IStrategy;
import annotated.validation.IValidator;
import annotated.visitor.Request;

/**
 * Created by Thomas on 7/3/2015.
 */
public class OperatorStrategy implements IValidator, IStrategy {

    @Override
    public String executeStrategy(Message message) {
        final Request request = message.getRequests();
        if (this.validate(request)) {
        }
        return "";
    }

    @Override
    public boolean validate(Request request) {
        final ArithmeticOperator requestOperation = request.getOperation();
        for(ArithmeticOperator operation: ArithmeticOperator.values()) {
            if(operation.equals(requestOperation)){
                return true;
            }
        }
        return false;
    }
}
