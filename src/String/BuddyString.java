package String;

public class BuddyString {
    public static boolean areBuddy(String s1,String s2){
        if (s1.length()!=s2.length())
            return false;
        if (s1.equals(s2)){
            int[] count=new int[26];
            for (char ch:s1.toCharArray())
                count[ch-'a']++;
            for (int c:count)
                if (c>1)
                    return true;
            return false;
        }
        else{
            int first=-1,second=-1;
            for (int i=0;i<s1.length();i++){
                if (s1.charAt(i)!=s2.charAt(i)){
                    if (first==-1)
                        first=i;
                    else if (second==-1)
                        second=i;
                    else
                        return false;
                }
            }
            return (second!=-1 && s1.charAt(first)==s2.charAt(second) && s1.charAt(second)==s2.charAt(first));
        }
    }
    public static void main(String[] args) {
        String s1="ab";
        String s2="ab";
        System.out.println(areBuddy(s1,s2));
    }
}
