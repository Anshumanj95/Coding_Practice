package String.Pattren;

import java.util.Arrays;

public class LpsArray {
    public static int[] lpsArray(String s){
        int n=s.length();
        int[] lps=new int[n];
        int i=1;
        int len=0;
        lps[0]=0;
        while(i<n){
            if(s.charAt(i)==s.charAt(len)){
                len++;
                lps[i]=len;
                i++;
            }
            else{
                if(len==0){
                    lps[i]=0;
                    i++;
                }
                else{
                    len=lps[len-1];
                }
            }
        }
        return lps;
    }
    public static void main(String[] args) {
        String s="ababa";
        System.out.println(Arrays.toString(lpsArray(s)));

    }
}
