package Matrix;

import java.util.Scanner;

public class MatrixSearch {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int[][] matrix=new int[n][m];
        for (int i=0;i<n;i++){
            for(int j=0;j<m;j++)
                matrix[i][j]=sc.nextInt();
        }
        int key=sc.nextInt();
        // in O(nm)
        boolean isPresent=false;
//        for (int i=0;i<n;i++){
//            for(int j=0;j<m;j++){
//                if(matrix[i][j]==key) {
//                    isPresent = true;
//                    break;
//                }
//            }
//        }
        // better approach when row and column are sorted in O(n+m)
        int r=0;
        int c=m-1;
        while(r<n && c>=0){
            if(matrix[r][c]==key){
                isPresent=true;
                break;
            }
            else if(matrix[r][c]>key)
                c--;
            else
                r++;
        }
        if(isPresent)
            System.out.println("Element is present");
        else
            System.out.println("Element is not found");
    }
}
