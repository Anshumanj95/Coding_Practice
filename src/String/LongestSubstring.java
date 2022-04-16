package String;
import java.lang.*;
import java.lang.Math;

public class LongestSubstring {
    public static int WithoutRepeating(String s){
        int[] a=new int[26];
        int i=0;
        int j=0;
        int max=Integer.MIN_VALUE;
        if(s.length()==0)
            return 0;
        while(i<s.length()){
            if(a[s.charAt(i)-'a']!=0){
                a[s.charAt(j)-'a']=0;
                j++;
            }
            else{
                a[s.charAt(i)-'a']=1;
                max= Math.max(max,i-j+1);
                i++;
            }
        }

        return max;
    }
    public static void main(String[] args) {
        String s="geeksforgeeks";
        System.out.println(WithoutRepeating(s));
    }
}
