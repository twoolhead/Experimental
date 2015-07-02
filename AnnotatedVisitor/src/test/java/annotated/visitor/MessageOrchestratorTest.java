package annotated.visitor;

import annotated.visitor.Message;
import annotated.visitor.MessageBootstrapper;
import annotated.visitor.User;
import annotated.visitor.UserMessage;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

@Test
public class MessageOrchestratorTest {

    public void shouldReturnAugmentedUserMessageFromMessageBootstrapper() {
        List<Message> listOfUserMessages = new ArrayList();

        final MessageBootstrapper messageBootstrapper = new MessageBootstrapper(listOfUserMessages);

        final String thisGitIsAGoodIdea = new String("Branching worked in the IDE.");

        messageBootstrapper
                .bootstrapMessage(new UserMessage(User.ADMIN, "annotated.visitor.Message from Admin to tear down some process."))
                .bootstrapMessage(new UserMessage(User.GUEST, "annotated.visitor.Message from annotated.visitor.User to perform some operation."))
                .bootstrapMessage(new UserMessage(User.GUEST, "annotated.visitor.Message from annotated.visitor.User to stop performing some operation."));
    }

}
