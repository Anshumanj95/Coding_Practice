package Recursion;

public class pii {
    public static String replacepi(String s){
        if(s.length()<=1)
            return s;
        if(s.charAt(0)=='p'&&s.charAt(1)=='i')
            return "3.14"+replacepi(s.substring(2));
        return s.charAt(0)+replacepi(s.substring(1));
    }
    public static void main(String[] args) {
        String ans=replacepi("piijjlcjclsdpi");
        System.out.println(ans);
    }
}
