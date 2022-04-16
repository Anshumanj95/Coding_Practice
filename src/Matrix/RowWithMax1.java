package Matrix;

public class RowWithMax1 {
    public static int RowMax1(int[][] arr,int n,int m) {
        int max_index=-1;
        int i=0;
        int j=m-1;
        while(i<n&&j>=0){
            if(arr[i][j]==1){
                j--;
                max_index=i;
            }
            else{
                i++;
            }
        }
        return max_index;
    }
    public static void main(String[] args) {
        int[][] mat = {{0, 1, 1, 1},
                {0, 0, 1, 1},
                {1, 1, 1, 1},
                {0, 0, 0, 0}};
        System.out.println(RowMax1(mat,mat.length,mat[0].length));
    }
}
