package ArrayPractice;

import java.util.Arrays;

public class DistributeNcandies_among_K_people {
    /*Given N candies and K people. In the first turn, the first person gets 1 candy, the second gets 2 candies, and so on till K people.
    In the next turn, the first person gets K+1 candies, the second person gets K+2 candies and so on.
    If the number of candies is less than the required number of candies at every turn, then the person receives the remaining number of candies.
    Find the total number of candies every person has at the end.*/
    public static long[] distribute(int n,int k){
        long[] ans=new long[k];
        Arrays.fill(ans,0);
        int i=0;
        int candy=1;
        while (n>0){
            if(candy<=n)
                ans[i]+=candy;
            else
                ans[i]+=n;
            n=n-candy;
            i++;
            if(i==k)
                i=0;
            candy++;
        }
        return ans;
    }
    public static void main(String[] args) {

    }
}
