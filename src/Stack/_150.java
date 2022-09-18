package Stack;

import java.util.PriorityQueue;
import java.util.Stack;

public class _150 {
    public static void main(String[] args) {
        String tokens[] = { "4", "13", "5", "/", "+" };
        System.out.println(evalRPN(tokens));
    }

    static public int evalRPN(String[] tokens) {

        Stack<Integer> stack = new Stack<>();

        for (String token : tokens) {
            switch (token) {
                case "+":
                    stack.push(stack.pop() + stack.pop());
                case "-":
                    stack.push(-(stack.pop() - stack.pop()));
                case "*":
                    stack.push(stack.pop() * stack.pop());
                case "/":
                    stack.push((int) ((1.00 / stack.pop()) * stack.pop()));
                default:
                    stack.push(Integer.parseInt(token));
            }
        }
        return stack.pop();
    }

}
