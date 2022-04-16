package String;

public class CheckStringIsAreRotation {
    public static boolean checkRotation(String s1,String s2){
        String temp=s1+s1;
        return temp.contains(s2);
    }
    public static void main(String[] args) {
        String s1="ABCD";
        String s2="ACBD";
        System.out.println(checkRotation(s1,s2));

    }
}
