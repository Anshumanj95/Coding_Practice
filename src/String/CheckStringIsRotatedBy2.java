package String;

public class CheckStringIsRotatedBy2 {
    public  static boolean check(String str1,String str2){
        int n=str1.length();
        int m=str2.length();
        if(n!=m)
            return false;
        if(n==1){
            if(str1.charAt(0)==str2.charAt(0))
                return true;
            return false;
        }
        String s1=str1.substring(2,n)+str1.substring(0,2);
        String s2=str1.substring(n-2,n)+str1.substring(0,n-2);
        if(s1.equals(str2)||s2.equals(str2))
            return true;
        return false;
    }
    public static void main(String[] args) {
        String s1="amazon";
        String s2="azonam";
        System.out.println(check(s1,s2));
    }
}
