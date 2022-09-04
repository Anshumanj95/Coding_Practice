package String;

import java.util.Arrays;

public class CheckIfTwoStringAreClose {
    public static boolean isClose(String s1,String s2){
        if (s1.length()!=s2.length())
            return false;
        int[] arr=new int[26];
        int[] brr=new int[26];
        for (char ch:s1.toCharArray())
            arr[ch-'a']++;
        for (char ch:s2.toCharArray())
            brr[ch-'a']++;
        for (int i=0;i<26;i++){
            if (arr[i]==brr[i])
                continue;
            if (arr[i]==0||brr[i]==0)
                return false;
        }
        Arrays.sort(arr);
        Arrays.sort(brr);
        for (int i=0;i<26;i++){
            if (arr[i]!=brr[i])
                return false;
        }
        return true;
    }
    public static void main(String[] args) {
        String s1="cabbba";
        String s2="abbccc";
        System.out.println(isClose(s1,s2));
    }
}
