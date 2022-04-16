package String;

public class isSubSequence {
    public static boolean check(String s1,String s2){
        if(s1.length()<s2.length())
            return false;
        int j=0;
        for(int i=0;i<s1.length()&&j<s2.length();i++){
            if(s1.charAt(i)==s2.charAt(j))
                j++;
        }
        return j==s2.length();
    }
    public static void main(String[] args) {
        String s1="Anshuman";
        String s2="ms";
        System.out.println(check(s1,s2));

    }
}
