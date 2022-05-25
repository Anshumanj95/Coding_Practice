package DynamicProgramming;

import java.util.Arrays;

public class Russian_Doll {
    public static int max_envelope(int[][] arr,int n){
        Arrays.sort(arr,(a,b)->a[0]==b[0]?b[1]-a[1]:a[0]-b[0]);
        int max_len=0;
        int[] dp=new int[n];
        for (int i=0;i<n;i++){
            int index=Arrays.binarySearch(dp,0,max_len,arr[i][1]);
            if (index<0)
                index=-(index+1);
            dp[index]=arr[i][1];
            if (index==max_len)
                max_len++;
        }
        return max_len;
    }
    public static void main(String[] args) {
        int[][] arr={{1,1},{1,1},{1,1}};
        System.out.println(max_envelope(arr,arr.length));
    }
}
