package ArrayPractice;

public class MaximumCircularSubArraySum {
    public static int naive(int[] arr){
        int n=arr.length;
        int res=arr[0];
        for(int i=0;i<n;i++){
            int curr_sum=arr[i];
            int curr_max=arr[i];
            for(int j=1;j<n;j++){
                int index=(i+j)%n;//for all circular subarray index
                curr_sum+=arr[index];
                curr_max=Math.max(curr_max,curr_sum);
            }
            res=Math.max(res,curr_max);
        }
        return res;
    }
    public static int kadane(int [] arr){
        int n=arr.length;
        int max_so_far=arr[0];
        int max_end_here=arr[0];
        for(int i=1;i<n;i++){
            max_end_here=Math.max(max_end_here+arr[i],arr[i]);
            max_so_far=Math.max(max_so_far,max_end_here);
        }
        return max_so_far;
    }
    // the idea is simple find normal sub array with max sum by using kadane then for finding max circular sum simply find sum of all element of array and subtract with minimum
    //sub array sum and return max of max circular and max normal
    public static int efficient(int[] arr){
        int n=arr.length;
        //simply using kadane algo to find maximum subarray sub in normal array
        int max_normal=kadane(arr);
        //if array is of negative element
       if(max_normal<0)
           return max_normal;
        //compute the sum of given arr then invert its element to find minimum sub array sum by using standard kadane instead of writing kadanes for
        //minimum sub array sum
        int arr_sum=0;
        for(int i=0;i<n;i++){
            arr_sum+=arr[i];
            arr[i]=-arr[i];
        }
        int max_circular=arr_sum+kadane(arr);
        return Math.max(max_circular,max_normal);
    }
    public static void main(String[] args) {
        int[] arr={5,-2,3,4};
        System.out.println(efficient(arr));

    }
}
