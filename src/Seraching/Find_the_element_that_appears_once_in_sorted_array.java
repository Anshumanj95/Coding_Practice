package Seraching;

public class Find_the_element_that_appears_once_in_sorted_array {
    public static int findOnce(int[] arr,int n){
        int s=0;
        int e=n-1;
        if (e==0)
            return arr[0];
        if (arr[0]!=arr[1])
            return arr[0];
        if (arr[e]!=arr[e-1])
            return arr[e];
        while (s<=e){
            int m=s+(e-s)/2;
            if (arr[m]!=arr[m-1] && arr[m]!=arr[m+1])
                return arr[m];
            //All elements before the required element have the first occurrence at even index and next occurrence at odd index.
            //All elements after the required element have the first occurrence at odd index and next occurrence at even index.
            if ((m%2==0 && arr[m]==arr[m+1])|| (m%2!=0 && arr[m]==arr[m-1]))
                s=m+1;
            else
                e=m-1;
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr={1,1,2,2,3,3,4,50,50,65,65};
        System.out.println(findOnce(arr,arr.length));
    }
}
