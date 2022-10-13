package SlidingWindow;

import java.util.ArrayList;
import java.util.HashMap;

public class AnagramSubStringSearch
{
    public static ArrayList<Integer> findAnagramsIndices(String str, String ptn, int n, int m) {
        // Write you code here.
        ArrayList<Integer> ans=new ArrayList<>();
        HashMap<Character,Integer> map1=new HashMap<>();
        HashMap<Character,Integer> map2=new HashMap<>();
        for(int i=0;i<m;i++){
            map1.put(ptn.charAt(i),map1.getOrDefault(ptn.charAt(i),0)+1);
            map2.put(str.charAt(i),map2.getOrDefault(str.charAt(i),0)+1);
        }
        if(map1.equals(map2))
            ans.add(0);
        for(int i=1;i+m-1<n &&i<n;i++){
            char prev=str.charAt(i-1);
            char next=str.charAt(i+m-1);
            map2.put(prev,map2.get(prev)-1);
            if(map2.get(prev)==0)
                map2.remove(prev);
            map2.put(next,map2.getOrDefault(next,0)+1);
            if(map2.equals(map1))
                ans.add(i);
        }
        return ans;
    }
    public static void main(String[] args) {

    }
}
