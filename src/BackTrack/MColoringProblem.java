package BackTrack;

import java.util.Arrays;
import java.util.List;

public class MColoringProblem {
    public static boolean graphColoring(List<Integer>[] G, int[] color, int i, int C)
    {
        // Your code here
        int v=G.length;
        Arrays.fill(color,-1);
        return dfs(G,color,v,C,0);
    }
    public static boolean dfs(List<Integer>[] G,int[] color,int v,int C,int i){
        if(i==v)
            return true;
        for(int j=0;j<C;j++){
            if(isSafe(G[i],color,v,j)){
                color[i]=j;
                if(dfs(G,color,v,C,i+1))
                    return true;
                color[i]=-1;
            }
        }
        return false;
    }
    public static boolean isSafe(List<Integer> a,int[] color,int v,int j){
        for(int i=0;i<a.size();i++){
            if(j==color[a.get(i)])
                return false;
        }
        return true;
    }
    public static void main(String[] args) {

    }
}
