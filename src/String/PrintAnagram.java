package String;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class PrintAnagram {
    public static List<List<String>> anagram(String[] word) {
        List<List<String>> list=new ArrayList<>();
        HashMap<String,List<String>> h=new HashMap<>();
        for(String s:word){
            char[] c=s.toCharArray();
            Arrays.sort(c);
            String str=new String(c);
            if(!h.containsKey(str)){
                h.put(str,new ArrayList<>());
            }
            h.get(str).add(s);
        }
        list.addAll(h.values());
        return list;
    }
    public static void main(String[] args) {
        String[] word={"act","god","cat","dog","tac"};
        List<List<String>> ans=anagram(word);
        for(int i=0;i<ans.size();i++){
            for(int j=0;j<ans.get(i).size();j++){
                System.out.print(ans.get(i).get(j)+" ");
            }
            System.out.println();
        }

    }
}
