package annotated.strategy;

import annotated.messages.Message;
import annotated.operations.StringOperator;
import annotated.validation.IValidator;
import annotated.visitor.Request;

/**
 * Created by Thomas on 7/3/2015.
 */
public class UpperCaseStrategy implements IValidator, IStrategy {

    @Override
    public String executeStrategy(Message message) {
        final Request request = message.getRequest();

        if (this.validate(request)) {
            return request.getRequest().toLowerCase();
        }

        return request.getRequest();
    }

    @Override
    public boolean validate(Request request) {
        final StringOperator[] operator = request.getOperation();

        for(StringOperator stringOperator : operator) {
            if (operator.equals(StringOperator.TO_LOWER)) {
                return true;
            }
        }

        return false;
    }
}
