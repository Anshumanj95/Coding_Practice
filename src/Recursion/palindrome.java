package Recursion;

public class palindrome {
    public static boolean isPalindrome(String s,int l,int r){
        if(l>=r)
            return true;
        if(s.charAt(l)!=s.charAt(r))
            return false;
        return isPalindrome(s,l+1,r-1);
    }
    public static void main(String[] args) {
        String s="abba";
        System.out.println(isPalindrome(s,0,s.length()-1));
        // using reverse a string then compare
//        StringBuffer str2=new StringBuffer(str1);
//        String str3= String.valueOf(str2.reverse());
//        if(str1.equals(str3))
//            System.out.println(str1+" is palindrome");
//        else
//            System.out.println(str1+" is not palindrome");
//        char[] str=str1.toCharArray();
    }
}
