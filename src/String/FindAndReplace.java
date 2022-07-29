package String;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class FindAndReplace {
    public static List<String> findAndReplacePattern(String[] words, String pattern) {

        List<String> ans=new ArrayList<>();
        int[] f=F(pattern);
        for (String s:words){
            int[] str=F(s);
            if (Arrays.equals(str,f)) {
                ans.add(s);
            }
        }
        return ans;
    }
    public static int[] F(String s){
        HashMap<Character,Integer> map=new HashMap<>();
        int n=s.length();
        int[] res=new int[n];
        for (int i=0;i<n;i++){
            map.putIfAbsent(s.charAt(i),map.size());
            res[i]=map.get(s.charAt(i));
        }
        return res;
    }

    public static void main(String[] args) {
        String[] word={"abc","deq","mee","aqq","dkd","ccc"};
        String patt="abb";
        System.out.println(findAndReplacePattern(word,patt));
    }
}
