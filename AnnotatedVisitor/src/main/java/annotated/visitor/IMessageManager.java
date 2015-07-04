package annotated.visitor;

import java.util.List;

/**
 * Created by Thomas on 7/3/2015.
 */
public interface IMessageManager {
    public abstract List<Response> processMessagesWithStrategy(final IStrategy strategy);
}
