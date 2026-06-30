import java.util.Stack;

public class PostfixEvaluation {

    public static int evaluatePostfix(String expression) {
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < expression.length(); i++) {
            char ch = expression.charAt(i);

            if (Character.isDigit(ch)) {
                stack.push(ch - '0');
            } else {
                int b = stack.pop();
                int a = stack.pop();

                if (ch == '+') stack.push(a + b);
                else if (ch == '-') stack.push(a - b);
                else if (ch == '*') stack.push(a * b);
                else if (ch == '/') stack.push(a / b);
            }
        }

        return stack.pop();
    }

    public static void main(String[] args) {
        String expression = "231*+9-";
        System.out.println(evaluatePostfix(expression));
    }
}