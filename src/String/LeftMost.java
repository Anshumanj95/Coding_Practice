package String;

import java.util.Arrays;

public class LeftMost {
    public static int leftMostReapted1(String s){
        int[] count=new int[256];
        for(int i=0;i<s.length();i++)
            count[s.charAt(i)]++;
        for(int i=0;i<s.length();i++){
            if(count[s.charAt(i)]>1)
                return i;
        }
        return -1;
    }
    public static int leftMostRepeated2(String s){
        boolean[] visited=new boolean[256];
        int res=-1;
        for(int i=s.length()-1;i>=0;i--){
            if(visited[s.charAt(i)])
                res=i;
            else
                visited[s.charAt(i)]=true;
        }
        return res;
    }
    public static int leftMostNonRepeated1(String s){
        int[] count=new int[256];
        for(int i=0;i<s.length();i++)
            count[s.charAt(i)]++;
        for(int i=0;i<s.length();i++){
            if(count[s.charAt(i)]==1)
                return i;
        }
        return -1;
    }
    public static int leftMostNonRepeated2(String s){
        int[] count=new int[256];
        Arrays.fill(count,-1);
        for(int i=0;i<s.length();i++){
            if(count[s.charAt(i)]==-1)
                count[s.charAt(i)]=i;
            else
                count[s.charAt(i)]=-2;
        }
        int res=Integer.MAX_VALUE;
        for(int i=0;i<256;i++){
            if(count[i]>0)
                res=Math.min(res,count[i]);
        }
        return res==Integer.MAX_VALUE?-1:res;
    }

    public static void main(String[] args) {
        String s="abcdabc";
        System.out.println(leftMostNonRepeated2(s));

    }
}
