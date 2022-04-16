package hash;

import java.util.HashSet;

public class LongestConsecutiveSubsequence {
    public static int longest(int[] arr){
        HashSet<Integer> h=new HashSet<>();
        for(int e:arr)
            h.add(e);
        int count=1;
        int res=1;
        for(Integer x:h) {
            if (!h.contains(x - 1)) {
                count = 1;
                while (h.contains(x + count))
                    count++;
                res = Math.max(count, res);
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] arr={1,3,4,2,5,9,10};
        System.out.println(longest(arr));
    }
}
