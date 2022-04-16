package Matrix;

public class MakeMatrixBeautiful {
//    A beautiful matrix is a matrix in which the sum of elements in each row and column is equal.
//    Given a square matrix of size NxN. Find the minimum number of operation(s) that are required to make the matrix beautiful. In one operation you can increment the value of any one cell by 1.
    static int findMinOperation(int[][] matrix, int n)
    {
        // code here
        int total=0,max=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            int row_sum=0,col_sum=0;
            for(int j=0;j<n;j++){
                row_sum+=matrix[i][j];
                col_sum+=matrix[j][i];
            }
            max=Math.max(max,row_sum);
            max=Math.max(max,col_sum);

            total+=row_sum;
        }

        return max*n-total;
    }
    public static void main(String[] args) {

    }
}
