package DynamicProgramming;

public class MinimumPages {
    //o(n^3*K)
    public static int minPage(int[] arr,int n,int k){
        int[][] dp=new int[k+1][n+1];
        for(int i=1;i<=n;i++){
            dp[1][i]=sum(arr,0,i-1);
        }
        for(int i=1;i<=k;i++){
            dp[i][1]=arr[0];
        }
        for(int i =2;i<=k;i++){
            for(int j=2;j<=n;j++){
                int res=Integer.MAX_VALUE;
                for(int p=1;p<j;p++){
                    res=Math.min(res,Math.max(dp[i-1][p],sum(arr,p,j-1)));
                }
                dp[i][j]=res;
            }
        }
        return dp[k][n];
    }
    public static int sum(int[] arr,int i,int j){
        int s=0;
        for (int k=i;k<=j;k++)
            s+=arr[k];
        return s;
    }
    public static void main(String[] args) {
        int[] arr={10,20,30,40};
        System.out.println(minPage(arr,arr.length,2));

    }
}
