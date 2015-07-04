package annotated.visitor;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Thomas on 6/18/2015.
 */
public class MessageManager implements IMessageManager {
    final private List<Message> managedMessages;

    public MessageManager(List<Message> messagesForBootstrapping) {
        this.managedMessages = messagesForBootstrapping;
    }

    @Override
    public List<Response> processMessagesWithStrategy(IStrategy strategy) {
        final List<Response> strategyResponses = new ArrayList<>();

        for(Message message : managedMessages) {
            message.acceptStrategy(strategy);
        }

        return strategyResponses;
    }

    public MessageManager bootstrapMessage(UserLevelMessage message){
        managedMessages.add(message);
        return this;
    };

    public List<Message> getManagedMessages() {
        return managedMessages;
    }
}
