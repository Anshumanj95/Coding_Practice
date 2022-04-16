package Greedy;

import java.util.Arrays;

public class SmallestStringWithAGivenNumericValue {
    public static String getSmallestString(int n,int k){
        if (n==1 && k==1)
            return "a";
        char[] arr=new char[27];
        for (int i=1;i<27;i++){
            arr[i]=(char)(i +'a'-1);
        }
        System.out.println(Arrays.toString(arr));
        StringBuilder ans=new StringBuilder();
        for (int i=n-1;i>=0;i--){
            if (k>26){
                ans.append(arr[26]);
                k=k-26;
            }
            else if (k==1)
                ans.append("a");
            else{
                ans.append(arr[k]);
                k-=k;
            }
        }
        return ans.toString();
    }
    public static void main(String[] args) {
        System.out.println(getSmallestString(3,27));
    }
}
