package Contest;

import java.util.Arrays;

public class ValidPairSum {
    static int ValidPair(int[] arr, int n)
    {
        Arrays.sort(arr);
        int ans = 0;
        for (int i = 0; i < n; ++i) {

            if (arr[i] <= 0)
                continue;
            int minReqVal = -arr[i] + 1;
            int j = lower_bound(arr, minReqVal);

            if (j >= 0)
                ans += i - j;
        }
        return ans;
    }

    static int lower_bound(int[] arr, int val)
    {
        int start = 0, end = arr.length;
        while (start < end) {
            int mid = (start + end) >> 1;

            if (val > arr[mid])
                start = mid + 1;
            else
                end = mid;
        }
        if (start == arr.length)
            return -1;

        return start;
    }
    public static void main(String[] args) {
        int[] a= {3,-2,1};
        int n = a.length;

        int ans = ValidPair(a, n);
        System.out.println(ans);
    }
    }
