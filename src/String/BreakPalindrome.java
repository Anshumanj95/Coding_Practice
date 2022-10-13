package String;

public class BreakPalindrome {
    //leetcode 1328
    public static String breakIt(String pal){
        int n= pal.length();
        if (n==1)//if impossible
            return "";
        StringBuilder s=new StringBuilder(pal);
        for (int i=0;i<n/2;i++){
            if (s.charAt(i)!='a'){//find first non 'a' index
                s.setCharAt(i,'a');// replace it with 'a' to get lexicography small
                return s.toString();
            }
        }
        s.setCharAt(n-1,'b');//if string contains only 'a' replace last by 'b'
        return s.toString();
    }
    public static void main(String[] args) {
        String s1="abccba";
        String s2="a";
        String s3="aaaaa";
        System.out.println(breakIt(s1));
        System.out.println(breakIt(s2));
        System.out.println(breakIt(s3));
    }
}
