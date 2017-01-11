package fundamentals;

import edu.princeton.cs.algs4.Stack;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

/**
 * Created by Edric on 17/1/10.
 */
public class E1_3_9_Postfix {
    private static boolean isOperator(String s) {
        return s.matches("[+*/-]");
    }
    public static void main(String[] args) {
        Stack<String> ops = new Stack<>();
        Stack<String> vals = new Stack<>();

        String[] ts = new String("1 + 2 ) * 3 - 4 ) * 5 - 6 ) ) )").split(" ");
        for (int i = 0; i < ts.length; i++){
            String s = ts[i];
            if (isOperator(s)) ops.push(s);
            else if (s.equals(")")) {
                String val1 = vals.pop();
                String val2 = vals.pop();
                String exstr = "( " + val2 + ops.pop() +  " " + val1 + ") ";
                vals.push(exstr);
            }
            else vals.push(s + " ");
        }
        StdOut.println(vals.pop());
    }
}
