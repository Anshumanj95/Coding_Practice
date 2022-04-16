package String;

import java.util.HashMap;

public class LongestKUniqueCharacterSubString {
    public static int longestKSubStr(String s,int k){
        //i is left and j is right pointer
        int i=0,j=0,n=s.length(),max=-1;
        HashMap<Character,Integer> map=new HashMap<>();
        while (j<n){
            //add the current character
            map.put(s.charAt(j),map.getOrDefault(s.charAt(j),0)+1);
            // if map.size==k then  current window is a possible answer then store in max
            if (map.size()==k)
                max=Math.max(max,j-i+1);
            //if size>k or(no of unique character is more than k) then reduce the window
            else if (map.size()>k){
                if (map.get(s.charAt(i))==1)
                    map.remove(s.charAt(i));
                else
                    map.put(s.charAt(i),map.get(s.charAt(i))-1);
                i++;
            }// right pointer is increase in all the case if map.size>k or map.size==k or map.size<k
            j++;
        }
        return max;
    }
    public static void main(String[] args) {
        String s="aabacbebebe";
        int k=3;
        System.out.println(longestKSubStr(s,k));

    }
}
