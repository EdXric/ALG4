package fundamentals;

/**
 * Created by Edric on 17/1/9.
 */
public class E1_2_6_CircularRotationIdentify {
    public static boolean CircularRotationIdentify(String s, String t) {
        return s.length() == t.length() && s.concat(s).indexOf(t) >= 0;
    }

    public static void main(String[] args) {
        String s = "\"acdce\"";
        String t = "\"ceacd\"";
        if (CircularRotationIdentify(s, t))
            System.out.println(s + " is the circular rotation of " + t);
        else
            System.out.println(s + " is not the circular rotation of " + t);
    }
}
