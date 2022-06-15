package Matrix;

public class RotateMatrixElementClockWise {
    public static int[][] rotate(int[][] arr,int n,int m){
        int row_start=0,row_end=n-1,col_start=0,col_end=m-1;
        while (row_start<row_end && col_start<col_end){
            int temp=arr[row_start+1][col_start];
            for (int i=col_start;i<=col_end;i++){
                int curr=arr[row_start][i];
                arr[row_start][i]=temp;
                temp=curr;
            }
            row_start++;
            for (int i=row_start;i<=row_end;i++){
                int curr=arr[i][col_end];
                arr[i][col_end]=temp;
                temp=curr;
            }
            col_end--;
            for (int i=col_end;i>=col_start;i--){
                int curr=arr[row_end][i];
                arr[row_end][i]=temp;
                temp=curr;
            }
            row_end--;
            for (int i=row_end;i>=row_start;i--){
                int curr=arr[i][col_start];
                arr[i][col_start]=temp;
                temp=curr;
            }
            col_start++;
        }
        return arr;
    }
    public static void main(String[] args) {
        int[][] arr={{1,2,3},{4,5,6},{7,8,9}};
        int[][] ans=rotate(arr,arr.length,arr[0].length);
        for (int[] i:ans) {
            for (int j : i)
                System.out.print(j + " ");
            System.out.println();
        }

    }
}
