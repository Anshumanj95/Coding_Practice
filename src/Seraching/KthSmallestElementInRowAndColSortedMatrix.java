package Seraching;

public class KthSmallestElementInRowAndColSortedMatrix {
    public static int kthSmallest(int[][] matrix,int k){
        int n=matrix.length;
        int m=matrix[0].length;
        int lo=matrix[0][0],hi=matrix[n-1][m-1]+1;
        while (lo<hi){
            int mid=lo+(hi-lo)/2;
            int count=0;
            int j=m-1;
            for (int i=0;i<n;i++){
                while (j>=0 && matrix[i][j]>mid)
                    j--;
                count+=(j+1);
            }
            if (count<k)
                lo=mid+1;
            else
                hi=mid;
        }
        return lo;
    }
    public static void main(String[] args) {
        int[][] matrix={{1,5,9},{10,11,13},{12,13,15}};
        System.out.println(kthSmallest(matrix,8));
    }
}
