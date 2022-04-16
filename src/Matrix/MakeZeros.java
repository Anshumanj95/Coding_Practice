package Matrix;

public class MakeZeros {
    /*
    Given a matrix of  size n x m. Your task is to make Zeroes, that means in whole matrix when you find a zero, convert its upper, lower, left, and right value to zero and make that element the sum of the upper, lower, left and right value. Do the following tasks according to the initial matrix.
     */
    public static void make(int[][]  matrix){
        int n=matrix.length;
        int m=matrix[0].length;
        int[][] mat=new int[n][m];
        for(int i=0;i<n;i++){
            System.arraycopy(matrix[i], 0, mat[i], 0, m);
        }
        for(int i=0;i<n;i++){
            for (int j=0;j<m;j++){
                if(mat[i][j]==0){
                    if(i>0){
                        matrix[i][j]+=mat[i-1][j];
                        matrix[i-1][j]=0;
                    }
                    if(i<n-1){
                        matrix[i][j]+=mat[i+1][j];
                        matrix[i+1][j]=0;
                    }
                    if(j>0){
                        matrix[i][j]+=mat[i][j-1];
                        matrix[i][j-1]=0;
                    }
                    if(i<m-1){
                        matrix[i][j]+=mat[i][j+1];
                        matrix[i][j+1]=0;
                    }
                }
            }
        }

    }
    public static void main(String[] args) {
        int[][] matrix={{1, 2, 3, 4},{5, 6, 0, 7},{8, 9, 4, 6}, {8, 4, 5, 2}};
        make(matrix);
        for (int[] ints : matrix) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(ints[j] + " ");
            }
            System.out.println();
        }

    }
}
