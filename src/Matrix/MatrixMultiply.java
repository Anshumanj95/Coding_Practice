package Matrix;

import java.util.Scanner;

public class MatrixMultiply {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        int n3=sc.nextInt();
        int[][] arr1=new int[n1][n2];
        int[][] arr2=new int[n2][n3];
        int[][] arr3=new int[n1][n3];
        for (int i = 0; i < n1; i++) {
            for (int j = 0; j < n2; j++) {
                arr1[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < n2; i++) {
            for (int j = 0; j < n3; j++) {
                arr2[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < n1; i++) {
            for (int j = 0; j < n3; j++) {
                for(int k=0;k<n2;k++){
                    arr3[i][j]+=arr1[i][k]*arr2[k][j];
                }
            }
        }
        System.out.println();
        for (int i = 0; i < n1; i++) {
            for (int j = 0; j < n3; j++) {
                System.out.print(arr3[i][j]+" ");
            }
            System.out.println();
        }
    }
}
