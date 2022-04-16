package Recursion;

public class Knapsack {
    public static int maxProfit(int[] value,int[] wt, int n,int W){
        if(n==0||W==0)
            return 0;
        if(wt[n-1]>W)
            return maxProfit(value, wt, n-1, W);

        return Math.max(maxProfit(value,wt,n-1,W-wt[n-1])+value[n-1],maxProfit(value, wt, n-1, W));

    }
    public static void main(String[] args) {
        int[] value={1,2,3};
        int[] wt={4,5,6};
        int W=3;
        System.out.println(maxProfit(value,wt,3,W));
    }
}
