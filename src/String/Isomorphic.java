package String;

public class Isomorphic {
    public static boolean areIsomorphic(String s1,String s2)
    {
        // Your code here
        if(s1.length()!=s2.length())
            return false;
        int[] c1=new int[26];
        int[] c2=new int[26];
        for(int i=0;i<s1.length();i++){
            c1[s1.charAt(i)-'a']++;
            c2[s2.charAt(i)-'a']++;
            if(c1[s1.charAt(i)-'a']!=c2[s2.charAt(i)-'a']){
                return false;
            }
        }
        return true;

    }
    public static void main(String[] args) {
        String s1="aab";
        String s2="xxy";
        System.out.println(areIsomorphic(s1,s2));

    }
}
