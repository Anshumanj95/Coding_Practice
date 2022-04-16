package bits;

public class BitDiffrenceAmongAllPairs {
    public static long bitDifference(int[] arr,int n){
        long ans=0;
        for (int i=0;i<32;i++){
            long count=0;
            for (int j=0;j<n;j++){
                // count the number of set bit an ith position in all number
                if ((arr[j] &(1<<i))!=0)
                    count++;
            }
            //count= no of set bits in all number
            // n-count=no of unset bit in all number *2 because every pair comes 2 times
            ans+=count*(n-count)*2;
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr={2,3,5,2,5};
        System.out.println(bitDifference(arr,arr.length));
    }
}
