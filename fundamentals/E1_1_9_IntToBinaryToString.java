package fundamentals;

/**
 * Created by Edric on 17/1/4.
 */
public class E1_1_9_IntToBinaryToString {
    public static void main(String[] args) {
        int N = 100;
        String s = "";
        for (int n = N; n > 0; n /= 2)
            s = (n % 2) + s;
        System.out.println(s);
    }
}
