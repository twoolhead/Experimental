package annotated.validation;

import annotated.visitor.Request;

/**
 * Created by Thomas on 7/3/2015.
 */
public interface IValidator {
    public abstract boolean validate(Request request);
}
