package String;

import java.util.HashSet;

public class MinimumIndexCharacter {
    public static int minIndexChar(String str, String patt)
    {
        // Your code here
//        int ans=Integer.MAX_VALUE;
//        for(char c:patt.toCharArray()){
//            int index=str.indexOf(c);
//            System.out.println(index);
//            if(index>=0)
//                ans=Math.min(ans,index);
//        }
//        if(ans==Integer.MAX_VALUE)
//            return -1;
//        return ans;
        HashSet<Character> h=new HashSet<>();
        for(int i=0;i<patt.length();i++){
            h.add(patt.charAt(i));
        }
        for(int i=0;i<str.length();i++){
            if(h.contains(str.charAt(i)))
                return i;
        }
        return -1;
    }
    public static void main(String[] args) {
        String str="geeksforgeeks";
        String patt="set";
        System.out.println(minIndexChar(str,patt));

    }
}
