package annotated.messages;

import annotated.operations.StringOperator;
import annotated.strategy.IStrategy;
import annotated.visitor.*;

/**
 * Created by Thomas on 6/18/2015.
 */
public final class UserLevelMessage implements Message {
    private final Role role;
    private final Request request;

    public UserLevelMessage(Role role, Request request) {
        this.request = request;
        this.role = role;
    }

    @Override
    public Response acceptStrategy(IStrategy strategy) {
        final String strategyResult = strategy.executeStrategy(this);

        return new Response(this.request, Result.PROCESSED, strategyResult);
    }

    @Override
    public Request getRequest() {
        return request;
    }

    public Role getRole() {
        return role;
    }
}
