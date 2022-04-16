package String;

public class validString {
    public static int maxLength(String s){
        int n=s.length();
        int len=0,left=0,right=0;
        for (int i=0;i<n;i++){
            if (s.charAt(i)=='(')
                ++left;
            else
                ++right;
            if(left==right)
                len=Math.max(len,2*right);
            else if (right>left)
                left=right=0;
        }
        left=right=0;
        for (int i=n-1;i>=0;i--){
            if (s.charAt(i)=='(')
                ++left;
            else
                ++right;
            if (left==right)
                len=Math.max(len,2*right);
            else if (left>right)
                left=right=0;
        }
        return len;
    }
    public static void main(String[] args) {
        String s="(()(";
        System.out.println(maxLength(s));

    }
}
