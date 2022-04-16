package String;

import java.util.Arrays;

public class anagramSearch {
    static final int CHAR=256;
    public static boolean search(String txt,String pat){
        int[] ct=new int[CHAR];
        int[] cp=new int[CHAR];
        for(int i=0;i<pat.length();i++){
            ct[txt.charAt(i)]++;
            cp[pat.charAt(i)]++;
        }
        for(int i=pat.length();i<txt.length();i++){
            if(Arrays.equals(ct,cp))
                return true;
            ct[txt.charAt(i)]++;
            ct[txt.charAt(i-pat.length())]--;
        }
        return false;
    }
    public static void main(String[] args) {
        String txt="geeksforgeeks";
        String pat="reeks";
        System.out.println(search(txt,pat));

    }
}
