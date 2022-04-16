package String;

import java.util.Locale;

public class Panagram {
    public static boolean isPanagram(String s){
        if(s.length()<26)
            return false;
        s=s.toLowerCase();
        int[] count=new int[26];
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)>='a'&&s.charAt(i)<='z'){
                count[s.charAt(i)-'a']++;
            }
        }
        for(int i=0;i<26;i++){
            if(count[i]==0)
                return false;
        }
        return true;

    }
    public static void main(String[] args) {
        String s="Bawds jog, flick quartz, vex nymph";
        System.out.println(isPanagram(s));

    }
}
