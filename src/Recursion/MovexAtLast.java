package Recursion;

public class MovexAtLast {
    public static String moveallx(String s){
        if(s.length()==0)
            return "";
        char ch=s.charAt(0);
        String ans=moveallx(s.substring(1));
        if(ch=='x')
            return ans+ch;
        return ch+ans;
    }
    public static void main(String[] args) {
        String ans=moveallx("xaasxxxddcccxsss");
        System.out.println(ans);
    }
}
