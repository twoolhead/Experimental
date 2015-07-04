package annotated.visitor;

/**
 * Created by Thomas on 7/3/2015.
 */
public enum Operator {
    MULTIPLY {
        @Override
        public Double performOperation(Double first, Double second) {
            return (first * second);
        }
    }, DIVIDE {
        @Override
        public Double performOperation(Double first, Double second) {
            return (first / second);
        }
    };

    public abstract Double performOperation(Double first, Double second);
}
