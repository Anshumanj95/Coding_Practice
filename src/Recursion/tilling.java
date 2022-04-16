package Recursion;

public class tilling {
    public static int ways(int n){
        if(n==0||n==1)
            return 1;

        return ways(n-1)+ways(n-2);
    }
    public static Long numberOfWays(int n) {
        long m=1000000007;
        long[] a=new long[n+1];
        a[0]=1;
        a[1]=1;
        for(int i=2;i<=n;i++){
            a[i]=(a[i-1]+a[i-2])%m;
        }
        return a[n];
    }
    public static void main(String[] args) {
        System.out.println(ways(4));
    }
}
