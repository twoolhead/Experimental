package annotated.visitor;

/**
 * Created by Thomas on 6/18/2015.
 */
public class UserMessage implements Message {
    private final String userMessage;
    private final User user;

    public UserMessage(User user, String userMessage) {
        this.userMessage = userMessage;
        this.user = user;
    }

    public UserMessage overrideMessage(String userMessage) {
        return new UserMessage(this.user, userMessage);
    }

    public UserMessage createUser(User user, String userMessage) {
        return new UserMessage(user, userMessage);
    }
}
