package String;

public class LongestPalindromicSubString {
    public static String longestPalindrome(String s) {
        if (s.length() <= 1)
            return s;
        int n = s.length();
        int start = 0, end = 0;
        int maxLen=0;
        //for Odd
        for (int i=0;i<n-1;i++){
            int l=i,r=i;
            while (l>=0 && r<n){
                if (s.charAt(l)==s.charAt(r)){
                    l--;
                    r++;
                }
                else
                    break;
            }
            int len=r-l-1;
            if (len>maxLen){
                maxLen=len;
                start=l+1;
                end=r-1;
            }
        }
        //for even
        for (int i=0;i<n-1;i++){
            int l=i,r=i+1;
            while (l>=0 && r<n){
                if (s.charAt(l)==s.charAt(r)){
                    l--;
                    r++;
                }
                else
                    break;
            }
            int len=r-l-1;
            if (len>maxLen){
                maxLen=len;
                start=l+1;
                end=r-1;
            }
        }
        return s.substring(start,end+1);
    }
    public static void main(String[] args) {
        System.out.println(longestPalindrome("babad"));

    }
}
