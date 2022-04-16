package SortingPractice;

public class Number_and_the_Digit_Sum {
    public static long sum(long num){
        long sum=0;
        while(num>0){
            long rem=num%10;
            sum+=rem;
            num/=10;
        }
        return sum;
    }
    public static long numberCount (long N, long K)
    {
        // your code here
        long high=N+1;
        long low=0;
        long ans=0;
        while(low<high){
            long mid=(low+high)/2;
            if((mid-sum(mid))>=K){
                ans=mid;
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        if(low-sum(low)>=K)
            return N-low+1;
        if(high-sum(high)>=K)
            return N-high+1;
        if(ans==0)
            return 0;
        return N-ans+1;
    }
    public static void main(String[] args) {

    }
}
