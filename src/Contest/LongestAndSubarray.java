package Contest;

import java.util.Arrays;
import java.util.Scanner;

public class LongestAndSubarray {
    public static int setbit(int n){
        int ans=0;
        while (n>0){
            ans++;
            n=n>>1;
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int N=sc.nextInt();
            int n=setbit(N);
            int ans1=N-(int)Math.pow(2,n-1)+1;
            int ans2=(int)Math.pow(2,n-1)-(int)Math.pow(2,n-2);
            System.out.println(Math.max(ans1,ans2));
        }
    }
}
