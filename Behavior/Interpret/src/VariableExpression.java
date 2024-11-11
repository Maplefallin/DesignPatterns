public class VariableExpression implements Expression {

    private String variable;

    public VariableExpression(String variable) {
        this.variable = variable;
    }

    @Override
    public int interpret(Context ctx) {
        return ctx.lookupVariable(variable);
    }
}
