package DynamicProgramming;

import java.math.BigInteger;

public class CountBSTWithNKeysAndCatalanNumber {
    //this i s application of catalan number.
    //nth catalan number =(1/(n+1))*2nCn
    // 2nd catalan number=(1/3)*4!/2!*2!=2
    //some staring catalan number are 1,1,2,5,14,42,..
    public static int countBst(int n){
        int[] dp=new int[n+1];
        dp[0]=1;
        for(int i=1;i<=n;i++){
            dp[i]=0;
            for(int j=0;j<i;j++){
                dp[i]+=dp[j]*dp[i-j-1];
            }
        }
        return dp[n];
        /*
        BigInteger[] dp=new BigInteger[n+1];
        dp[0]=BigInteger.ONE;
        dp[1]=BigInteger.ONE;
        for(int i=2;i<=n;i++){
            dp[i]=new BigInteger("0");
            for(int j=0;j<i;j++){
                dp[i]=dp[i].add(dp[j].multiply(dp[i-j-1]));
            }
        }
        return dp[n];
         */
    }
    public static int catalanNUmber(int n){
        if(n==0)
            return 1;
        int cat=1;
        for(int i=1;i<=n;i++){
            cat*=(4*i-2);
            cat/=(i+1);
        }

        return cat;
    }
    public static void main(String[] args) {
        System.out.println(countBst(5));
        System.out.println(catalanNUmber(100));

    }
}
