package String;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class CountOccurenceAnagram {
    public static int count(String txt,String pat){
        if(pat.length()>txt.length())
            return 0;
        int[] arr=new int[26];
        for(int i=0;i<pat.length();i++)
            arr[pat.charAt(i)-'a']++;
        int[] txta=new int[26];
        int i=0;
        int j=0;
        int count=0;
        while(j<txt.length()){
            if(j-i==pat.length()){
                txta[txt.charAt(i)-'a']--;
                i++;
            }
            txta[txt.charAt(j)-'a']++;
            j++;
            if(Arrays.toString(arr).equals(Arrays.toString(txta))) {
                System.out.println(Arrays.toString(arr) +" "+ Arrays.toString(txta));
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        String txt = "forxxorfxdofr";
        String pat="for";
        System.out.println(count(txt,pat));
    }
}
