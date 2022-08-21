package String;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StampingTheSequence {
    public static int[] movesToStamp(String stamp, String target) {
        char[] s=stamp.toCharArray();
        char[] t=target.toCharArray();
        List<Integer> ans=new ArrayList<>();
        boolean[] visited=new boolean[t.length];
        int stars=0;
        while(stars<t.length){
            boolean doneReplace=false;
            for(int i=0;i<=t.length-s.length;i++){
                if(!visited[i] && canReplace(t,i,s)){
                    stars+=doReplace(t,i,s.length);
                    doneReplace=true;
                    visited[i]=true;
                    ans.add(i);
                    if(stars==t.length)
                        break;
                }
            }
            if(!doneReplace)
                return new int[0];
        }
        System.out.println(ans);
        int[] arr=new int[ans.size()];
        for(int i=0;i<ans.size();i++){
            arr[i]=ans.get(ans.size()-i-1);
        }
        return arr;

    }
    public static boolean canReplace(char[] t,int p,char[] s){
        for(int i=0;i<s.length;i++){
            if(t[i+p]!='*' && t[i+p]!=s[i])
                return false;
        }
        return true;
    }
    public static int doReplace(char[] t,int p,int len){
        int count=0;
        for(int i=0;i<len;i++){
            if(t[i+p]!='*'){
                t[i+p]='*';
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        String stamp="abca";
        String target="aabcaca";
        System.out.println(Arrays.toString(movesToStamp(stamp, target)));
    }
}
