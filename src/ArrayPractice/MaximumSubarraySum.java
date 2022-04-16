package ArrayPractice;

public class  MaximumSubarraySum {
    public static int KandanesAlgo(int[] arr){
        int max_so_far=arr[0];
        int max_end_here=arr[0];
        int n=arr.length;
        for(int i=1;i<n;i++){
            max_end_here=Math.max(max_end_here+arr[i],arr[i]);
            max_so_far=Math.max(max_end_here,max_so_far);
        }
        return max_so_far;
    }
    public static void main(String[] args) {
        int[] arr={-1,-2,-3,-4};
        System.out.println(KandanesAlgo(arr));

    }
}
