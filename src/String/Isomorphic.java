package String;

import java.util.Arrays;

public class Isomorphic {
    public static boolean areIsomorphic(String s1,String s2)
    {
        // Your code here
        if(s1.length()!=s2.length())
            return false;
        int[] c1=new int[26];
        int[] c2=new int[26];
        for(int i=0;i<s1.length();i++){
            c1[s1.charAt(i)-'a']++;
            c2[s2.charAt(i)-'a']++;
            if(c1[s1.charAt(i)-'a']!=c2[s2.charAt(i)-'a']){
                return false;
            }
        }
        return true;
    }
    //if all ascii value are present in string
    public static boolean isIsomorphic(String s,String t){
        if(s.length()!=t.length())
            return false;
        int[] c1=new int[256];
        Arrays.fill(c1,-1);
        int[] c2=new int[256];
        Arrays.fill(c2,-1);
        for(int i=0;i<s.length();i++){
            char st=s.charAt(i);
            char tt=t.charAt(i);
            if(c1[st]==-1 && c2[tt]==-1){
                c1[st]=tt;
                c2[tt]=st;
            }
            else if(!(c1[st]==tt && c2[tt]==st))
                return false;
        }
        return true;
    }
    public static void main(String[] args) {
        String s1="aab";
        String s2="xxy";
        System.out.println(areIsomorphic(s1,s2));

    }
}
