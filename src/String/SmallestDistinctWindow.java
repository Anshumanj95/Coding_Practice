package String;

import java.util.HashMap;
import java.util.HashSet;

public class SmallestDistinctWindow {
    public static String smallest(String str){
        HashMap<Character,Integer> map=new HashMap<>();
        HashSet<Character> set=new HashSet<>();
        for (char ch:str.toCharArray())
            set.add(ch);
        int k=set.size();
        String ans=str;
        int i=-1,j=-1,n=str.length()-1;
        while (i<n && j<n){
            while (i<n && map.size()<k){
                i++;
                map.put(str.charAt(i),map.getOrDefault(str.charAt(i),0)+1);
            }
            while (j<i && map.size()==k){
                String curr=str.substring(j+1,i+1);
                if (curr.length()<ans.length())
                    ans=curr;
                j++;
                char ch=str.charAt(j);
                if (map.get(ch)==1)
                    map.remove(ch);
                else
                    map.put(ch,map.get(ch)-1);
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        String str="abcdcda";
        System.out.println(smallest(str));
    }
}
