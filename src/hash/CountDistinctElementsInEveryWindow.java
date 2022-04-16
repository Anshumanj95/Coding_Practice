package hash;

import java.util.Arrays;
import java.util.HashMap;

public class CountDistinctElementsInEveryWindow {
    public static String removeLeading(String s){
        String[] arr=s.split("\\.");
        System.out.println(Arrays.toString(arr));
        StringBuilder ans=new StringBuilder();
        for (String i:arr){
            StringBuilder curr=new StringBuilder(i);
            while (curr.charAt(0)=='0' && curr.length()>1)
                curr.deleteCharAt(0);
            ans.append(curr).append(".");
        }

        System.out.println(ans);
        return "0";
    }
    public static void main(String[] args) {
        String s="100.000.99.009";
        removeLeading(s);
    }
}
