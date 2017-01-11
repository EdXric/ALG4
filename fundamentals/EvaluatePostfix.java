package fundamentals;

import edu.princeton.cs.algs4.Stack;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

/**
 * Created by Edric on 17/1/11.
 */
public class EvaluatePostfix {
    public static void evaluatePostfixOperation(String s, Stack<Integer> stack) {
        if (s.equals("+")) stack.push(stack.pop() + stack.pop());
        else if (s.equals("-")) stack.push(stack.pop() - stack.pop());
        else if (s.equals("*")) stack.push(stack.pop() * stack.pop());
        else if (s.equals("/")) stack.push(stack.pop() / stack.pop());
        else stack.push(Integer.parseInt(s));
    }
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<Integer>();
        String[] ss = "3 4 5 + *".split(" ");
        for (int i = 0; i < ss.length; i++){
            String s = ss[i];
            evaluatePostfixOperation(s, stack);
        }
        StdOut.println(stack.pop());
    }
}
