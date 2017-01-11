package fundamentals;

import edu.princeton.cs.algs4.Stack;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

/**
 * Created by Edric on 17/1/11.
 */
public class InfixToPostfix {
    private static boolean isOperator(String s) {
        return s.equals("+") || s.equals("-") || s.equals("*");
    }
    public static void infixToPostfixOperation(String s, Stack<String> stack) {
        if (isOperator(s)) stack.push(s);
        else if (s.equals(")")) StdOut.print(stack.pop() + " ");
        else if (s.equals("(")) StdOut.print("");
        else StdOut.print(s + " ");
    }
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        while (!StdIn.isEmpty()){
            String s = StdIn.readString();
            infixToPostfixOperation(s, stack);
        }
        StdOut.println();
    }
}
