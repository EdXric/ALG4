package fundamentals;

import edu.princeton.cs.algs4.In;

import java.util.Arrays;

/**
 * Created by Edric on 17/1/10.
 */
public class E1_2_15_NewReadInts {
    public static int[] readInts(String name) {
        In in = new In(name);
        String input = in.readAll();
        String[] words = input.split("\\s+");
        int[] ints = new int[words.length];
        for (int i = 0; i < words.length; i++)
            ints[i] = Integer.parseInt(words[i]);
        return ints;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(readInts("src/fundamentals/ints.txt")));
    }
}
