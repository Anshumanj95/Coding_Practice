package Recursion;

public class ReverseString {
    public static String reverse(String s){
        if(s.length()==0)
            return s;
        String ros=s.substring(1);
        return reverse(ros)+s.charAt(0);
    }
    public static void main(String[] args) {
        String ans=reverse("Anshuman");
        System.out.print(ans);
    }
}
