package annotated.messages;

import annotated.strategy.IStrategy;
import annotated.visitor.Request;
import annotated.visitor.Response;

/**
* Created by Thomas on 6/18/2015.
        */
public interface Message {
    public abstract Response acceptStrategy(final IStrategy strategy);
    public abstract Request getRequest();
}
