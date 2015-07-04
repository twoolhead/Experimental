package annotated.strategy;

import annotated.messages.Message;

/**
 * Created by Thomas on 7/3/2015.
 * To handle Message Requests and decorate Responses.
 */
public interface IStrategy {
    public abstract String executeStrategy(final Message message);
}
