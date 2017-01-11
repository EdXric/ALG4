package fundamentals;

import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdOut;

import java.util.Stack;

/**
 * Created by Edric on 17/1/10.
 */
public class E1_3_4_Parentheses {
    private static final char LEFT_PAREN = '(';
    private static final char RIGHT_PAREN = ')';
    private static final char LEFT_BRACE = '{';
    private static final char RIGHT_BRACE = '}';
    private static final char LEFT_BRACKET = '[';
    private static final char RIGHT_BRACKET = ']';

    public static boolean isBalanced(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == LEFT_PAREN) stack.push(LEFT_PAREN);
            if (s.charAt(i) == LEFT_BRACE) stack.push(LEFT_BRACE);
            if (s.charAt(i) == LEFT_BRACKET) stack.push(LEFT_BRACKET);

            if (s.charAt(i) == RIGHT_PAREN) {
                if (stack.isEmpty()) return false;
                if (stack.pop() != LEFT_PAREN) return false;
            } else if (s.charAt(i) == RIGHT_BRACE) {
                if (stack.isEmpty()) return false;
                if (stack.pop() != LEFT_BRACE) return false;
            } else if (s.charAt(i) == RIGHT_BRACKET) {
                if (stack.isEmpty()) return false;
                if (stack.pop() != LEFT_BRACKET) return false;
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
//        In in = new In();
//        String s = in.readAll().trim();
        String s1 = "[()]{}{[()()]()}";
        StdOut.println(isBalanced(s1));

        String s2 = "[(])";
        StdOut.println(isBalanced(s2));
    }
}
