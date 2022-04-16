package SortingPractice;

public class N_trailing_zeroes_in_factorials {
    public static int trailingZero(int n){
        int ans=0;
        for(int i=5;i<=n;i*=5)
            ans+=(n/i);
        return ans;
    }
    public static int countZeros(int n){
        //for printing numbers only
        int low=0;
        int high=1000000;
        while (low<=high){
            int mid=(low+high)/2;
            if(trailingZero(mid)==n)
                return 5;
            if(trailingZero(mid)>n)
                high=mid-1;
            else
                low=mid+1;
        }
             return 0;
        //for printing digits also

    }
    public static void print(int n){
        int low=0;
        int high=1000000;
        while(low<=high){
            int mid=(low+high)/2;
            if(trailingZero(mid)<n)
                low=mid+1;
            else
                high=mid-1;
        }
        int[] result = new int[1000];
        int k = 0;
        while (trailingZero(low) == n) {
            result[k] = low;
            k++;
            low++;
        }
        for (int i = 0; i < k; i++)
            System.out.print(result[i] + " ");

    }
    public static int findNum(int n)
    {
        // Complete this function
        int low=0;
        int high=50000;
        int ans=0;
        while(low<high){
            int mid=(low+high)/2;
            if(trailingZero(mid)>=n){
                ans=mid;
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int n=1;
        System.out.println(findNum(n));

    }
}
