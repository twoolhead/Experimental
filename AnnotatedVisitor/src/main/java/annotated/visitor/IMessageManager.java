package annotated.visitor;

import annotated.strategy.IStrategy;

import java.util.List;

/**
 * Created by Thomas on 7/3/2015.
 */
public interface IMessageManager {
    public abstract List<Response> processMessagesWithStrategy(final IStrategy strategy);
}
