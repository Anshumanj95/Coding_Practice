package String;

import java.util.HashMap;

public class LongestRepeatingCharacterReplacement {
    public static int characterReplacement(String s,int k){
        char[] arr=s.toCharArray();
        int left=0,right=0,n=arr.length,maxLen=0,maxFreq=0;
        HashMap<Character,Integer> map=new HashMap<>();
        while (right<n){
            map.put(arr[right],map.getOrDefault(arr[right],0)+1);
            maxFreq=Math.max(maxFreq,map.get(arr[right]));
            if ((right-left+1)-maxFreq>k){
                map.put(arr[left],map.get(arr[left])-1);

                left++;
            }
            maxLen=Math.max(maxLen,right-left+1);
            right++;
        }
        return maxLen;
    }
    public static void main(String[] args) {
        String s="ABAB";
        System.out.println(characterReplacement(s,2));
    }
}
