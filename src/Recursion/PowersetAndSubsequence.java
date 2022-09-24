package Recursion;

public class PowersetAndSubsequence {
    public static void set(String s,String ans){
        if(s.length()==0){
            System.out.print(ans+",");
            return;
        }
        set(s.substring(1),ans);
        set(s.substring(1),ans+s.charAt(0));
    }
    public static void ascii(String s,String ans){
        if(s.length()==0){
            System.out.print(ans+" ");
            return;
        }
        int code=s.charAt(0);
        ascii(s.substring(1),ans);
        ascii(s.substring(1),ans+s.charAt(0));
        ascii(s.substring(1),ans+code);
    }
    public static void main(String[] args) {
        ascii("ABC","");
    }
}
