package String;

import java.util.Arrays;

public class LongestSubStringWithDistinct {
    //in O(n)
    public static int findLongest(String s){
        int n=s.length();
        int[] prev=new int[256];
        Arrays.fill(prev,-1);
        int i=0,res=0;
        for(int j=0;j<n;j++){
            i=Math.max(i,prev[s.charAt(j)]+1);
            int maxEnd=j-i+1;
            res=Math.max(maxEnd,res);
            prev[s.charAt(j)]=j;
        }
        return res;
    }
    public static int findLongest2(String s){
        int n=s.length();
        int res=0;
        for(int i=0;i<n;i++){
            boolean[] visited=new boolean[256];
            for(int j=i;j<n;j++){
                if(visited[s.charAt(j)])
                    break;
                else{
                    res=Math.max(res,j-i+1);
                    visited[s.charAt(j)]=true;
                }
            }
        }
        return res;
    }
    public static void main(String[] args) {
        String s="abcabcabcdasd";
        System.out.println(findLongest2(s));

    }
}
