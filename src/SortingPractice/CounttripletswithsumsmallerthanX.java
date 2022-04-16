package SortingPractice;

import java.util.Arrays;

public class CounttripletswithsumsmallerthanX {
    public static long countTriplet(int[] arr,int n,int sum){
        long count=0;
        Arrays.sort(arr);
        for(int i=0;i<n-2;i++){
            int j=i+1,k=n-1;
            while(j<k){
                if(arr[i]+arr[j]+arr[k]<sum){
                    count+=(k-j);
                    j++;
                }
                else k--;
            }
        }
        return count;
    }
    public static void main(String[] args) {

    }
}
