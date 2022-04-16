package SortingPractice;
import java.util.*;
public class PlatformNMaximumGuest {
    public static int maxCount(int[] arr,int[] dep){
        Arrays.sort(arr);
        Arrays.sort(dep);
        int n=arr.length;
        int res=0;
        int i=0,j=0,curr=0;
        while(i<n&&j<n){
            if(arr[i]<=dep[j]){
                curr++;
                if(res<curr){
                   // System.out.println(arr[i]); for print the time also
                    res=curr;
                }
                i++;

            }
            else{
                curr--;
                j++;
            }
        }
        return res;
    }
    public static void main(String[] args) {
    int[] arr={ 900, 940, 950, 1100, 1500, 1800 };
        int[] dep={ 910, 1200, 1120, 1130, 1900, 2000 };
        System.out.println(maxCount(arr,dep));
    }
}
