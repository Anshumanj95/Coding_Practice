package Matrix;

public class boundaryTraversal {
    public static void traversal(int[][] mat){
        int n=mat.length;
        int m=mat[0].length;
        if(n==1){
            for(int i=0;i<m;i++)
                System.out.print(mat[0][i]+" ");
        }
        else if(m==1){
            for (int i=0;i<n;i++)
                System.out.print(mat[i][0]+" ");
        }
        else{
            for(int i=0;i<m;i++)
                System.out.print(mat[0][i]+" ");
            for(int i=1;i<n;i++)
                System.out.print(mat[i][m-1]+" ");
            for(int i=m-2;i>=0;i--)
                System.out.print(mat[n-1][i]+" ");
            for(int i=n-2;i>=1;i--)
                System.out.print(mat[i][0]+" ");
        }
    }
    public static void main(String[] args) {
        int[][] mat={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        traversal(mat);
    }
}
