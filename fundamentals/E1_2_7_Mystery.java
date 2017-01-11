package fundamentals;

/**
 * Created by Edric on 17/1/9.
 */
public class E1_2_7_Mystery {
    public static String mystery(String s){
        int N = s.length();
        if (N <= 1) return s;
        String a = s.substring(0, N / 2);
        System.out.println(a);
        String b = s.substring(N / 2, N);
        return mystery(b) + mystery(a);
    }

    public static void main(String[] args) {
        System.out.println(mystery("apple"));
    }
}
