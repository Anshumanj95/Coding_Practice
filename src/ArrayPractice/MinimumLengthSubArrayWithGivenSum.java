package ArrayPractice;

public class MinimumLengthSubArrayWithGivenSum {
    public static int minimum(int[] arr,int n,int x){
        int s=0,e=0;
        int start=0;
        int min=n+1;
        int sum=0;
        while (e<n){
            sum+=arr[e];
            while (sum>x){
                if (e-s+1<min){
                    min=e-s+1;
                    start=s;
                }
                sum-=arr[s++];
            }
            e++;
        }
        for (int i=start;i<start+min;i++)
            System.out.print(arr[i]+" ");
        return min;
    }
    public static void main(String[] args) {
        int[] arr={13,7,12,2};
        System.out.println(minimum(arr,arr.length,13));
    }
}
