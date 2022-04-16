package Matrix;

public class booleanMatrix {
    //modify it such that if a matrix cell matrix[i][j] is 1 then all the cells in its ith row and jth column will become 1.
    public static void booleanMatrix(int[][] mat)
    {
        // code here
        int n=mat.length;
        int m=mat[0].length;
        int[] row=new int[n];
        int[] col=new int[m];

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(mat[i][j]==1){
                    row[i]=1;
                    col[j]=1;
                }
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(row[i]==1||col[j]==1){
                    mat[i][j]=1;
                }
            }
        }

    }
    public static void main(String[] args) {
        int R = 4,C = 3;
        int[][]matrix = {{ 1, 0, 0},
            { 1, 0, 0},
            { 1, 0, 0},
            { 0, 0, 0}};
        booleanMatrix(matrix);

        for (int i=0;i<R;i++){
            for(int j=0;j<C;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }

    }
}
