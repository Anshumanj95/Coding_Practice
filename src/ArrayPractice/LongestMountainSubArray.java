package ArrayPractice;

public class LongestMountainSubArray {
    public static int longestMountains(int[] arr,int n){
        int max=0;
        for (int i=1;i<n-1;){
            if (arr[i]>arr[i-1] && arr[i]>arr[i+1]){
                int count=1;
                int j=i;
                while (j>0 && arr[j]>arr[j-1]){
                    j--;
                    count++;
                }
                while (i<n-1 && arr[i]>arr[i+1]){
                    i++;
                    count++;
                }
                max=Math.max(count,max);
            }
            else
                i++;
        }
        return max;
    }
    public static void main(String[] args) {
        int[] arr={1,3,1,4,3,1};
        System.out.println(longestMountains(arr,arr.length));
    }
}
