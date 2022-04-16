package graph;

import java.util.Arrays;

public class MinimumSpannigTreePrims {
    // the time complexity of this implementation is O(v^2)
    //total time complexity of better approach is O(vlogv)
    public static int printMST(int[][] graph,int v){
        int[] key=new int[v];
        int res=0;
        Arrays.fill(key,Integer.MAX_VALUE);
        key[0]=0;
        boolean[] mSet=new boolean[v];
        for (int count=0;count<v;count++){
            int u=-1;
            //getting smaller value from un visited graph
            // in better approach we do this by considering  min heap
            //extract min funtion
            for(int i=0;i<v;i++){
                if(!mSet[i]&&(u==-1||key[i]<key[u]))
                    u=i;
            }
            mSet[u]=true;
            res=res+key[u];
            //consider adjancent smaller value two mset graph
            //in better approach we use adjacency list of connected and weighted graph which takes O(v+e) time
            for(int j=0;j<v;j++){
                //decrease key funtion of min heap
                if(!mSet[j] && graph[u][j]!=0&& graph[u][j]<key[j])
                    key[j]=graph[u][j];
            }
        }
        return res;
    }
    public static void main(String[] args) {

    }
}
