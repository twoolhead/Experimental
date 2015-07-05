package annotated.visitor;

import static org.testng.Assert.assertNotNull;

import annotated.messages.Message;
import annotated.messages.UserLevelMessage;
import annotated.operations.StringOperator;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

@Test
public class MessageOrchestratorTest {

    public void shouldReturnAugmentedUserMessageFromMessageBootstrapper() {
        final List<Message> messages = new ArrayList<>();

        messages.add(
                new UserLevelMessage(Role.ADMIN, new Request(new String("MAKE ME LOWER CASE."), StringOperator.TO_LOWER)));
        messages.add(
                new UserLevelMessage(Role.GUEST, new Request(new String("make me upper case."), StringOperator.TO_UPPER)));

        final MessageOrchestrator messageOrchestrator = new MessageOrchestrator();
        final List<Response> messageResponses = messageOrchestrator.orchestrateMessages(messages);

        assertNotNull(messageResponses);
    }

}
