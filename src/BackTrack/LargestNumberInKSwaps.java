package BackTrack;

import java.util.Arrays;

public class LargestNumberInKSwaps {
    static String max;
    public static String largestNumber(int k,String str) {
        if(k==0)
            return "";
        max=str;
        solve(str.toCharArray(),k);
        return max;
    }
    public static void solve(char[] arr,int k){
        if(k==0)
            return;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]>arr[i]){
                    char temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                    String s=new String(arr);
                    if(s.compareTo(max)>0)
                        max=s;
                    solve(arr,k-1);
                    char temp2=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp2;
                }
            }
        }
    }
    public static void main(String[] args) {
        System.out.println(largestNumber(3,"3435335"));
    }
}
