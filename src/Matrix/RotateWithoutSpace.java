package Matrix;

import String.Pattren.ImprovedNavieForDistinct;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class RotateWithoutSpace {
    public static void rotate1(int[][] matrix,int n){
        //Anti clockwise
        for(int i=0;i<n/2;i++){
            for(int j=i;j<n-i-1;j++){
                int temp=matrix[i][j];
                matrix[i][j]=matrix[j][n-1-i];
                matrix[j][n-1-i]=matrix[n-1-i][n-1-j];
                matrix[n-1-i][n-1-j]=matrix[n-1-j][i];
                matrix[n-1-j][i]=temp;
            }
        }
        //clockwise
        for(int i=0;i<n/2;i++){
            for(int j=i;j<n-i-1;j++){
                int temp=matrix[i][j];
                matrix[i][j]=matrix[n-1-j][i];
                matrix[n-1-j][i]=matrix[n-1-i][n-1-j];
                matrix[n-1-i][n-1-j]=matrix[j][n-1-i];
                matrix[j][n-1-i]=temp;
            }
        }
    }
    public static  void anti_rotate90(int[][] matrix,int n){
        //swap acc to secondary diagonal
        for(int i=0;i<n-1;i++){
            for (int j=0;j<n-1-i;j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[n-1-j][n-1-i];
                matrix[n-1-j][n-1-i] = temp;
            }
        }
        //swap acc to mid column
        for (int i=0;i<n;i++){
            for (int j=0;j<n/2;j++){
                int temp=matrix[i][j];
                matrix[i][j]=matrix[i][n-j-1];
                matrix[i][n-j-1]=temp;
            }
        }
        for (int[] arr:matrix){
            for (int i:arr)
                System.out.print(i+" ");
            System.out.println();
        }
    }
    //first swap element according to main diagonal and then swap element according to middle column
    public static  void rotate90(int[][] matrix,int n){
        //swap acc to main diagonal
        for(int i=0;i<n;i++){
            for (int j=i+1;j<n;j++){
                    int temp = matrix[i][j];
                    matrix[i][j] = matrix[j][i];
                    matrix[j][i] = temp;
            }
        }
        //swap acc to mid column
        for (int i=0;i<n;i++){
            for (int j=0;j<n/2;j++){
                int temp=matrix[i][j];
                matrix[i][j]=matrix[i][n-j-1];
                matrix[i][n-j-1]=temp;
            }
        }
        for (int[] arr:matrix){
            for (int i:arr)
                System.out.print(i+" ");
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        int[][] matrix=new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                matrix[i][j]=sc.nextInt();
            }
        }
        rotate90(matrix,matrix.length);





    }

}
