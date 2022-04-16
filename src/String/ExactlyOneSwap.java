package String;

import java.util.HashMap;

public class ExactlyOneSwap {
    public static long countDistinct(String s){
        /*
        Given a string S containing lowercase english alphabet characters. The task is to calculate the number of distinct strings that can be obtained after performing exactly one swap.
In one swap,Geek can pick two distinct index i and j (i.e 1 < i < j < |S| ) of the string, then swap the characters at the position i and j.
         */
        long n= s.length();
        long ans=0;
        HashMap<Character,Integer> map=new HashMap<>();
        for (int i=0;i<n;i++)
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
        for (int i=0;i<s.length();i++){
            char x=s.charAt(i);
            int diff=map.get(x);
            ans+=(n-diff);
            n--;
            map.put(x,map.get(x)-1);
        }
        if (map.size()==s.length())
            return ans;
        else
            return ans+1;
    }
    public static void main(String[] args) {
       long ans=countDistinct("geek");
        System.out.println(ans);

    }
}
