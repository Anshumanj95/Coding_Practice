package ArrayPractice;

public class MaximizeNumberof1s {
//    Given a binary array arr of size N and an integer M. Find the maximum number of consecutive 1's produced by flipping at most M 0's.
    public static int findZeros(int[] arr,int n,int m){
        int i=0;
        int j=0;
        int max=0;
        int count=0;
        while(i<n){
            if(arr[i]==0)
                count++;
            while(count>m){
                if(arr[j]==0)
                    count--;
                j++;
            }
            max=Math.max(max,i-j+1);
            i++;
        }
        return max;
    }
    public static void main(String[] args) {
        int[] arr={1,0,0,1,1,0,1,0,1,1,1};
        System.out.println(findZeros(arr,arr.length,2));

    }
}
