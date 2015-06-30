package annotated.visitor;

import java.util.List;

/**
 * Created by Thomas on 6/18/2015.
 */
public class MessageBootstrapper {

    final private List<Message> messagesForBootstrapping;

    public MessageBootstrapper(List<Message> messagesForBootstrapping) {
        this.messagesForBootstrapping = messagesForBootstrapping;
    }

    public MessageBootstrapper bootstrapMessage(UserMessage userMessage){
        messagesForBootstrapping.add(userMessage);
        return this;
    };

    public List<Message> getMessagesForBootstrapping() {

        return messagesForBootstrapping;
    }
}
