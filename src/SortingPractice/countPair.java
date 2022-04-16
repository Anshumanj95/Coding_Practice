package SortingPractice;

import java.util.Arrays;

public class countPair {
    // x[], y[]: input array elements
    // M, N: size of arrays x[] and y[] respectively
    //Function to count number of pairs such that x^y is greater than y^x.
    static long countPairs(int[] x, int[] y, int m, int n)
    // if y>x then x^y>y^x
    {
        // your code here
        int[] NoOfY = new int[5];
        for (int i = 0; i < n; i++)
            if (y[i] < 5)
                NoOfY[y[i]]++;

        Arrays.sort(y);

        long total_pairs = 0;
        for (int i = 0; i < m; i++)
            total_pairs += count(x[i], y, n, NoOfY);

        return total_pairs;
    }
    static int count(int x, int[] Y, int n, int[] NoOfY)
    {
        if (x == 0)
            return 0;
        if (x == 1)
            return NoOfY[0];
        int idx = Arrays.binarySearch(Y, x);
        int ans;
        if (idx < 0) {
            idx = Math.abs(idx + 1);
            ans = Y.length - idx;
        }
        else {
            while (idx < n && Y[idx] == x) {
                idx++;
            }
            ans = Y.length - idx;
        }
        ans += (NoOfY[0] + NoOfY[1]);
        if (x == 2)
            ans -= (NoOfY[3] + NoOfY[4]);
        if (x == 3)
            ans += NoOfY[2];

        return ans;
    }
    public static void main(String[] args) {
        int[] x={1,2,5};
        int[] y={1,5};
        System.out.println(countPairs(x,y,x.length,y.length));

    }
}
