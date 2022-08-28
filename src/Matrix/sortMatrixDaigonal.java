package Matrix;

import java.util.HashMap;
import java.util.PriorityQueue;

public class sortMatrixDaigonal {
    public static int[][] sort(int[][] mat){
        int n=mat.length;
        int m=mat[0].length;
        HashMap<Integer,PriorityQueue<Integer>> map=new HashMap<>();
        for (int i=0;i<n;i++){
            for (int j=0;j<m;j++){
                map.putIfAbsent(i-j,new PriorityQueue<>());
                map.get(i-j).add(mat[i][j]);
            }
        }
        for (int i=0;i<n;i++){
            for (int j=0;j<m;j++){
                mat[i][j]=map.get(i-j).poll();
            }
        }
        return mat;
    }
    public static void main(String[] args) {
        int[][] mat={{11,25,66,1,69,7},{23,55,17,45,15,52},{75,31,36,44,58,8},{22,27,33,25,68,4},{84,28,14,11,5,50}};
        int[][] ans=sort(mat);
        for (int[] arr:ans){
            for(int i:arr)
                System.out.print(i+" ");
            System.out.println();
        }
    }
}
