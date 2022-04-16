package ArrayPractice;

public class StockBuyAndSell {
    //when we have given only once you can buy or sell or we can say when you buy you cant buy again until you sell last one
    public static int maxProfit(int[] arr){
        int n= arr.length;
        int profit=0;
        for(int i=1;i<n;i++) {
            if (arr[i] > arr[i - 1])
                profit += arr[i] - arr[i - 1];
        }
        return profit;

    }
    public static void main(String[] args) {
        int[] arr={1,5,3,8,12};
        System.out.println(maxProfit(arr));
    }
}
