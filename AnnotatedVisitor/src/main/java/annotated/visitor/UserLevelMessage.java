package annotated.visitor;

/**
 * Created by Thomas on 6/18/2015.
 */
public final class UserLevelMessage extends BaseMessage {

    public UserLevelMessage(Role role, Request requests, Availability availability) {
        this.availability = availability;
        this.requests = requests;
        this.role = role;
    }

    @Override
    public Response acceptStrategy(IStrategy strategy) {
        if (Availability.UNAVAILABILE.equals(this.availability)) {
            return new Response(this.requests, Result.NOT_PROCESSED, "");
        }
        final String strategyResult = strategy.executeStrategy(this);
        return new Response(this.requests, Result.PROCESSED, strategyResult);
    }
}
