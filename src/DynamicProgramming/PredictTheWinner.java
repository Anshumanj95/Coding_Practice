package DynamicProgramming;

public class PredictTheWinner {
    public static boolean ifPlayer1Win(int[] nums,int n){
        int[][] dp=new int[n][n];
        for (int s=n;s>=0;s--){
            for (int e=s;e<n;e++){
                if (s==e)
                    dp[s][e]=nums[s];
                else{
                    // pick first coin and recur for s+1 to e
                    int a=nums[s]-dp[s+1][e];
                    // pick last coin and recur for s to e-1
                    int b=nums[e]-dp[s][e-1];
                    dp[s][e]=Math.max(a,b);
                }
            }
        }
        return dp[0][n-1]>=0;
    }
    public static void main(String[] args) {
        int[] nums={1,5,2};
        System.out.println(ifPlayer1Win(nums,nums.length));
    }
}
