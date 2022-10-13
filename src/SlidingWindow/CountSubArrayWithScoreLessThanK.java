package SlidingWindow;

public class CountSubArrayWithScoreLessThanK {
    //The score of an array is defined as the product of its sum and its length.
    public static long countSubArray(int[] arr,int k){
        long curr=0,count=0;
        for (int i=0,j=0;j<arr.length;j++){
            curr+=arr[j];
            while (curr*(j-i+1)>=k)
                curr-=arr[i++];
            count+=(j-i+1);
        }
        return count;
    }
    public static void main(String[] args) {

    }
}
