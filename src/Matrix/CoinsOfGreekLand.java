package Matrix;

public class CoinsOfGreekLand {
    public static int Maximum_Sum(int mat[][],int N,int k){
        int ans=-1;
        for(int i=0;i<N-k+1;i++){
            for(int j=0;j<N-k+1;j++){
                int curr=0;
                for(int l=0;l<k;l++){
                    for(int m=0;m<k;m++){
                        curr+=mat[l+i][m+j];
                    }
                }
                if (curr>ans)
                    ans=curr;

            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[][] mat={{1, 1, 1, 1, 1},
                {2, 2, 2, 2, 2},
                {3, 8, 6, 7, 3},
                {4, 4, 4, 4, 4},
                {5, 5, 5, 5, 5}};
        System.out.println(Maximum_Sum(mat, mat.length, 3));
    }
}
