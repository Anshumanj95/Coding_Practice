package String;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class GroupAnagrams {
    public static List<List<String>> groupAnagram(String[] strs){
        if (strs==null|| strs.length==0)
            return new ArrayList<>();
        HashMap<String,List<String>> map=new HashMap<>();
        for (String s:strs){
            char[] ch=s.toCharArray();
            Arrays.sort(ch);
            String key=String.valueOf(ch);
            if (!map.containsKey(key))
                map.put(key,new ArrayList<>());
            map.get(key).add(s);
        }
        return new ArrayList<>(map.values());
    }
    public static void main(String[] args) {
        String[] strs={"eat","tea","bat","tan","nat","ate"};
        System.out.println(groupAnagram(strs));
    }
}
