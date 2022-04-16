package String;

import java.math.BigInteger;

public class LexographicalRankOfString {
    public static long fact(int n){
        if(n==0)
            return 1;
        return (n*fact(n-1));
    }
    public static long rank(String s){
        long res=1;
        int n=s.length();
        long mul=fact(n);
        int[] count=new int[256];
        for(int i=0;i<n;i++){
            count[s.charAt(i)]++;
        }
        for(int i=1;i<256;i++){
            count[i]+=count[i-1];
        }
        for(int i=0;i<n-1;i++){
            mul=mul/(n-i);
            res=res+count[s.charAt(i)-1]*mul;
            for(int j=s.charAt(i);j<256;j++){
                count[j]--;
            }
        }
        return res;
    }
    public static void main(String[] args) {
        String s="acb";
        System.out.println(rank(s));

    }
}
