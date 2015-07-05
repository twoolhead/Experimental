package annotated.messages;

import annotated.operations.StringOperator;
import annotated.strategy.IStrategy;
import annotated.visitor.*;

/**
 * Created by Thomas on 6/18/2015.
 */
public final class UserLevelMessage implements Message {
    private final Request request;

    public UserLevelMessage(Request request) {
        this.request = request;
    }

    @Override
    public Response acceptStrategy(final IStrategy strategy) {
        final String strategyResult = strategy.executeStrategy(this);
        return null;
    }

    @Override
    public Request getRequest() {
        return request;
    }
}
