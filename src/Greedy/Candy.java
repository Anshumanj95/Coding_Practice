package Greedy;

import java.util.Arrays;

public class Candy {
    public static int minimumCandyToDistribute(int[] rating){
        int n=rating.length;
        int[] candies=new int[n];
        Arrays.fill(candies,1);
        for (int i=1;i<n;i++){
            if (rating[i]>rating[i-1])
                candies[i]=candies[i-1]+1;
        }
        int sum=candies[n-1];
        for (int i=n-2;i>=0;i--){
            if (rating[i]>rating[i+1])
                candies[i]=Math.max(candies[i],candies[i+1]+1);
            sum+=candies[i];
        }
        return sum;
    }
    public static void main(String[] args) {
        int[] rating={1,0,2};
        System.out.println(minimumCandyToDistribute(rating));
    }
}
