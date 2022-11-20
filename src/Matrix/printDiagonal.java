package Matrix;

import java.util.ArrayList;

public class printDiagonal {
    public static ArrayList<Integer> print_diagonal(int[][] matrix,int n){
        int i=0,j=0;
        ArrayList<Integer> ans=new ArrayList<>();
        while (i<n && j<n ){
            int tempi=i,tempj=j;
            while (tempi<n && tempj>=0){
                ans.add(matrix[tempi][tempj]);
                tempi++;
                tempj--;
            }
            j++;
            if (j==n){
                j--;
                i++;
            }
        }
        return ans;
    }
    public static void main(String[] args) {

    }
}
