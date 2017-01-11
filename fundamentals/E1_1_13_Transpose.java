package fundamentals;

import java.util.Arrays;

/**
 * Created by Edric on 17/1/4.
 */
public class E1_1_13_Transpose {
    static int M = 2;
    static int N = 3;
    static int[][] a = new int[M][N];

    public static void main(String[] args) {
        System.out.println(Arrays.deepToString(a));
        int[][] temp = new int[N][M];
        for (int i = 0; i < M; i++)
            for (int j = 0; j< N; j++)
                temp[j][i] = a[i][j];
        a = temp;
        System.out.println(Arrays.deepToString(a));
    }
}
