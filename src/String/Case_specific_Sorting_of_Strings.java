package String;

import java.util.ArrayList;
import java.util.Collections;

public class Case_specific_Sorting_of_Strings {
    public static String caseSort(String str)
    {
        // Your code here
        ArrayList<Character> lower=new ArrayList<>();
        ArrayList<Character> upper=new ArrayList<>();
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)>='a' &&str.charAt(i)<='z'){
                lower.add(str.charAt(i));
            }
            else
                upper.add(str.charAt(i));
        }
        Collections.sort(upper);
        Collections.sort(lower);
        StringBuilder ans= new StringBuilder();
        int k=0,j=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)>='a' && str.charAt(i)<='z'){
                ans.append(lower.get(k++));
            }
            else{
                ans.append(upper.get(j++));
            }
        }
        return ans.toString();
    }
    public static void main(String[] args) {
        String s="defRTSersUXI";
        System.out.println(caseSort(s));
    }
}
