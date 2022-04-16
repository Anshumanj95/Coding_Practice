package Seraching;

public class Kth_Smallest_Number_in_Multiplication_Table {
    public static int KthSmallest(int m,int n,int k){
        int low=1,high=m*n;
        while (low<=high){
            int mid=(low+high)/2;
            if (smaller(mid,m,n,k))
                high=mid;
            else
                low=mid+1;
        }
        return low;
    }
    public static boolean smaller(int num,int m,int n,int k){
        int count=0;
        for (int i=1;i<=m;i++)
            count+=Math.min(num/i,n); // count the number of smaller element than the mid value.
        return count>=k;
    }

    public static void main(String[] args) {
        System.out.println(KthSmallest(3,3,5));

    }
}
