package DynamicProgramming;

import java.util.Arrays;
//top-down approach O(n)
// simply store calculate value in memo[] and dimension of memo array depends upon variable change is recursive function
// here only n is change therefore memo  in 1D array
public class Memoization {
    public static int fib(int n){
        int[] memo=new int[n+1];
        Arrays.fill(memo,-1);
        if(memo[n]==-1){
            int res;
            if(n==0||n==1)
                res=n;
            else
                res=fib(n-1)+fib(n-2);
            memo[n]=res;
        }
        return memo[n];
    }
    public static void main(String[] args) {
        System.out.println(fib(4));
    }
}
