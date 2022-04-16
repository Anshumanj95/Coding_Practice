package stack;
import static stack.Largest_Rectangular_Area_in_a_Histogram.*;
public class Largest_Rectangle_with_all_ones {
    public static int largest(int[][] mat){
        int r=mat.length;
        int c=mat[0].length;
        int res=largestArea2(mat[0],c);
        for(int i=1;i<r;i++){
            for(int j=0;j<c;j++){
                if(mat[i][j]==1){
                    mat[i][j]+=mat[i-1][j];
                }
            }
            res=Math.max(res,largestArea2(mat[i],c));
        }
        return res;
    }
    public static void main(String[] args) {
        int[][] M = {{0 ,1 ,1, 0},
                {1 ,1 ,1 ,1},
                {1 ,1, 1, 1},
                {1 ,1 ,0 ,0}};
        System.out.println(largest(M));
    }
}
