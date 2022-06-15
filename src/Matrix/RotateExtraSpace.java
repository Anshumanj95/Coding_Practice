package Matrix;

import java.util.Scanner;

public class RotateExtraSpace {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[][] matrix=new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                matrix[i][j]=sc.nextInt();
            }
        }
        int[][] rotate=new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                rotate[j][n-i-1]=matrix[i][j];//for clockwise replace row and column with each other on both side
            }
        }
        //without extra space

       for(int i=0;i<n;i++){
           for(int j=0;j<n;j++){
               System.out.print(rotate[i][j]+" ");
           }
           System.out.println();
        }
    }
}
