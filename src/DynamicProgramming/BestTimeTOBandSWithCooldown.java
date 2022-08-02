package DynamicProgramming;

public class BestTimeTOBandSWithCooldown {
    //Cooldown: you cannot buy share next day after you sell
    public static int maxProfit(int[] arr){
        if (arr==null || arr.length<=1)
            return 0;
        int b1=-arr[0],b0=b1;
        int s0=0,s1=0,s2=0;
        for (int i=1;i<arr.length;i++){
            //max of buy (i-1 , (cooldown)sell[i-2]-arr[i])
            b0=Math.max(b1,s2-arr[i]);
            //max of sell(i-1,buy[i-1]+arr[i])
            s0=Math.max(s1,b1+arr[i]);
            b1=b0;s2=s1;s1=s0;
        }
        return s0;
    }
    public static void main(String[] args) {
        int[]arr={1,2,3,0,2};
        System.out.println(maxProfit(arr));
    }
}
