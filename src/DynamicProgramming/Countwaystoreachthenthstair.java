package DynamicProgramming;

public class Countwaystoreachthenthstair {
    //fibonacci series
    //order matters
    public static int ways(int n){
        int[] dp=new int[n+1];
        dp[0]=1;
        dp[1]=1;
        for (int i=2;i<=n;i++){
            dp[i]=dp[i-1]+dp[i-2];
        }
        return dp[n];
    }
    //order does not matter
    public static int ways2(int m){
        //we just need to count how many no. of 2's we can possibly have for the given value of m.

        // for e.g if m=5

        //case1 : (zero 2 : 1 1 1 1 1 )

        //case2 : (one 2 : 2 1 1 1)

        //case3 : (two 2: 2 2 1)

        // and since the order doesn't matter , we can simply return how many times we can use 2
        return 1+(m/2);
    }
    public static void main(String[] args) {
        System.out.println(ways(4));
    }
}
