public class Main {
    public static void main(String[] args) {
        // 创建上下文并定义变量
        Context context = new Context();
        context.defineVariable("x", 10);
        context.defineVariable("y", 5);

        // 构建表达式：((x + y) * 2) - 3
        Expression expression = new SubtractExpression(
                new MultiplyExpression(
                        new AddExpression(
                                new VariableExpression("x"),
                                new VariableExpression("y")
                        ),
                        new NumberExpression(2)
                ),
                new NumberExpression(3)
        );

        // 解释表达式
        int result = expression.interpret(context);
        System.out.println("Result: " + result);

        //Interpret在构建领域特定语言DSL的时候比较有效
        //一般分为终结符、非终结符、上下文、客户端
    }
}