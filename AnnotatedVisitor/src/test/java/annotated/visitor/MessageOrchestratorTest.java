package annotated.visitor;

import static org.testng.Assert.assertNotNull;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

@Test
public class MessageOrchestratorTest {

    public void shouldReturnAugmentedUserMessageFromMessageBootstrapper() {
        final List<Message> messages = new ArrayList<>();

        messages.add(new UserLevelMessage(Role.ADMIN, new Request(Operator.MULTIPLY, new String("1"), new String("2")), Availability.AVAILABILE));
        messages.add(new UserLevelMessage(Role.GUEST, new Request(Operator.DIVIDE, new String("5"), new String("3")), Availability.AVAILABILE));

        final MessageOrchestrator messageOrchestrator = new MessageOrchestrator();
        final List<Response> messageResponses = messageOrchestrator.orchestrateMessages(messages);

        assertNotNull(messageResponses);
    }

}
