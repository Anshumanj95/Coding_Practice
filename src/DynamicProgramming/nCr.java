package DynamicProgramming;

public class nCr {
    public static int ncrModP(int n,int r){
        // nCr=C(n-1,r-1)+C(n-1,r)
        if(n<r){
            return 0;
        }
        int[][] dp=new int[n+1][r+1];
        //nCn=1
        for(int i=1;i<=r;i++)
            dp[i][i]=1;
        //nC1=n
        for(int i=1;i<=n;i++)
            dp[i][1]=i;
        for(int i=3;i<=n;i++){
            for(int j=2;j<=r;j++){
                dp[i][j]=(dp[i-1][j-1]+dp[i-1][j])%(1000000007);
            }
        }
        return dp[n][r];
    }
    public static void main(String[] args) {
        System.out.println(ncrModP(3,2));

    }
}
