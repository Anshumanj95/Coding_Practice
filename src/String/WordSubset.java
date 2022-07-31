package String;

import java.util.ArrayList;
import java.util.List;

public class WordSubset {
    public static List<String> wordSubsets(String[] words1, String[] words2) {
        int[] bmax=count("");
        for(String b:words2){
            int[] bCount=count(b);
            for(int i=0;i<26;i++)
                bmax[i]=Math.max(bmax[i],bCount[i]);
        }
        List<String> ans=new ArrayList<>();
        search:for(String a:words1){
            int[] aCount=count(a);
            for(int i=0;i<26;i++){
                if(aCount[i]<bmax[i])
                    continue search;
            }
            ans.add(a);
        }
        return ans;
    }
    public static int[] count(String s){
        int[] ans=new int[26];
        for(char ch:s.toCharArray())
            ans[ch-'a']++;
        return ans;
    }
    public static void main(String[] args) {
        String[] words1 = {"amazon","apple","facebook","google","leetcode"};
        String[] words2 = {"e","o"};
        System.out.println(wordSubsets(words1,words2));
    }
}
