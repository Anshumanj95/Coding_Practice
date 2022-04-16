package Matrix;

public class ConstructMatrixByUserInputN {
    static final int MAX = 100;
    static int[][] mat = new int[MAX][MAX];
    public static void construct(int n){
        int right=n-1;
        int left=0;
        for(int i=0;i<n;i++){

            // Alternatively fill 1s starting from
            // rightmost and leftmost columns. For
            // example for n = 3, we get { {_ _ 1},
            // {1 _ _} {_ 1 _}}
            if(i%2==0){
                mat[i][right]=1;
                fillremain(i,right,n);
                right--;
            }
            else{
                mat[i][left]=1;
                fillremain(i,left,n);
                left++;
            }
        }
    }
    public static void fillremain(int i,int j,int n){
        int x=2;
        //fill  below rows
        for(int k=i+1;k<n;k++)
            mat[k][j]=x++;
        // fill above rows
        for(int k=0;k<i;k++)
            mat[k][j]=x++;
    }
    public static void main(String[] args) {
        int n=5;
        construct(n);
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++)
                System.out.print(mat[i][j]+" ");
            System.out.println();
        }

    }
}
