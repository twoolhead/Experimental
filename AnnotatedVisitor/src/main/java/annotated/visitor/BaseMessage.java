package annotated.visitor;

/**
 * Created by Thomas on 7/3/2015.
 */
public abstract class BaseMessage implements Message {
        protected Availability availability;
        protected Role role;
        protected Request requests;

        public BaseMessage(Role role, Request requests, Availability availability) {
            this.availability = availability;
            this.role = role;
            this.requests = requests;
        }

    public BaseMessage() {
    }

    @Override
    public Request getRequests() {
        return requests;
    }

    public Role getRole() {
        return role;
    }

    public Availability getAvailability() {
        return availability;
    }
}
