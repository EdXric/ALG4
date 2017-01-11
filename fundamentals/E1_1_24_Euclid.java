package fundamentals;

/**
 * Created by Edric on 17/1/4.
 */
public class E1_1_24_Euclid {
    // Not use arguments
    private static int a = 105;
    private static int b = 24;
    public static int gcd(int p, int q) {
        if (q == 0) return p;
        int r = p % q;
        System.out.println("p = " + q + ", q = " + r);
        return gcd(q, r);
    }
    public static void main(String[] args) {
        int p = Integer.parseInt(args[0]),
        q = Integer.parseInt(args[1]);
        System.out.println("p = " + p + ", q = " + q);
        int ans = gcd(p, q);
        System.out.println("The greatest common divisor is : " + ans);
    }
}
