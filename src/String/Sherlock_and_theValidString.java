package String;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;

public class Sherlock_and_theValidString {
    public static String isValid(String s) {
        int prev = Integer.MAX_VALUE;
        boolean flag = true;
        int count=0;

        HashMap<Character ,Integer> map =new HashMap<>();
        for(char c:s.toCharArray())
            map.put(c, map.getOrDefault(c,0) + 1);
        prev = map.get(s.charAt(0));
        for(Integer i:map.values()){
            if(i==prev){
                count++;
                continue;

            }else if((Math.abs(i - prev)==1 || (i-1)==0) && flag){
                flag =false;
                count++;
            }
        }
        if(count==map.size())
            return "YES";
        else
            return "NO";


    }
    public static void main(String[] args) {
        String s="aabbccddeefghi";
        System.out.println(isValid(s));
    }
}
