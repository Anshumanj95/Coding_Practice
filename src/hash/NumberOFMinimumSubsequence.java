package hash;

import java.util.HashMap;

public class NumberOFMinimumSubsequence {
    public static int numMatching(String s,String[] words){
        HashMap<String,Integer> map=new HashMap<>();
        for (String str:words)
            map.put(str,map.getOrDefault(str,0)+1);
        int ans=0;
        char[] arr=s.toCharArray();
        for (String str:words){
            int i=0,j=0;
            char[] curr=str.toCharArray();
            while (i<arr.length && j<curr.length){
                if (arr[i]==curr[j]){
                    i++;
                    j++;
                }
                else
                    i++;
            }
            if (j== curr.length)
                ans+=map.get(str);
        }
        return ans;
    }
    public static void main(String[] args) {
        String[] words={"a","bb","acd","ace"};
        String s="abcde";
        System.out.println(numMatching(s,words));
    }
}
