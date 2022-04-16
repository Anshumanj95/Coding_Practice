package Matrix;

import java.util.ArrayList;

public class Find_rectangle_with_corners_as1 {

    public  static boolean isValidCorner(int[][] matrix){

        for (int i=0;i<matrix.length;i++){
            for (int j=i+1;j<matrix.length;j++){
                int cnt=0;
                for (int k=0;k<matrix[0].length;k++){
                    if (matrix[i][k]==1 && matrix[j][k]==1)
                        cnt++;
                }
                if (cnt>=2)
                    return true;
            }
        }
        return false;

    }
    public static void main(String[] args) {
        int[][] matrix={{1, 0,0 ,1, 0}, {0, 0 ,1 ,0, 1}, {0, 0, 0, 1, 0}, {1, 0, 1, 0, 1}};
        System.out.println(isValidCorner(matrix));

    }
}
