package DynamicProgramming;

public class BestTimeToBandSUnlimitedBS {
    public static int maxProfit(int[] arr){
        int aheadBuy=0,aheadNotBuy=0,currBuy=0,currNotBuy=0;
        for (int i=arr.length-1;i>=0;i--){
            currBuy=Math.max(-arr[i]+aheadNotBuy,aheadBuy);
            currNotBuy=Math.max(arr[i]+aheadBuy,aheadNotBuy);
            aheadBuy=currBuy;
            aheadNotBuy=currNotBuy;
        }
        return currBuy;
    }
    public static void main(String[] args) {
        int[] arr={1,3,2,8,4,9};
        System.out.println(maxProfit(arr));
    }
}
