package String;

import java.util.Arrays;

public class LongestCommonPrefix {
    public static String lcp(String[] strings,int n){
        if (n==0)
            return "";
        if (n==1)
            return strings[0];
        Arrays.sort(strings);
        System.out.println(Arrays.toString(strings));
        String lcp="";
        String s1=strings[0];
        String s2=strings[n-1];
        for (int i=0;i<s1.length();i++){
            if (s1.charAt(i)==s2.charAt(i))
                lcp+=s1.charAt(i);
            else
                break;
        }
        if (lcp.length()==0)
            return "-1";
        return lcp;
    }
    public static void main(String[] args) {
        String[] strings={"geeksforgeeks", "geeks", "geek", "geezer"};
        System.out.println(lcp(strings,strings.length));
    }
}
