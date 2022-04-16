package String;

public class LongestPalindromicSubString {
    public static String longestPalindrome(String s){
        if (s.length()<=1)
            return s;
        int n=s.length();
        int start=0,end=0;
        for (int i=0;i<n;i++){
            int len1=extendFromCenter(s,i,i+1);//for even length
            int len2=extendFromCenter(s,i,i);//for odd length
            int len=Math.max(len1,len2);
            if (len-1>end-start){
                start=i-(len-1)/2;
                end=i+len/2;
            }
        }
        return s.substring(start,end+1);
    }
    public static int extendFromCenter(String s,int i,int j){
        while (i>=0 && j<s.length() && s.charAt(i)==s.charAt(j)){
            i--;
            j++;
        }
        return j-i-1;
    }
    public static void main(String[] args) {
        System.out.println(longestPalindrome("abba"));

    }
}
