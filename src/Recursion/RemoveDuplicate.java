package Recursion;

public class RemoveDuplicate {
    public static String remDup(String s){
        if(s.length()<=1)
            return s;
        char ch=s.charAt(0);
        String ans=remDup(s.substring(1));
        if (ch==ans.charAt(0)) {
            return ans;
        }
        return (ch+ans);
    }
    public static void main(String[] args) {
        String ans=remDup("aaabbbccceytrrewweeaaaaa");
        System.out.println(ans);
    }
}
