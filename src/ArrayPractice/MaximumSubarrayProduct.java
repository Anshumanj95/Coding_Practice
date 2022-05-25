package ArrayPractice;

public class MaximumSubarrayProduct {
    public static int max_product_subArray(int[] arr){
        int max_product=arr[0];
        int max_ending_here=arr[0];
        int min_ending_here=arr[0];
        for (int i=1;i<arr.length;i++){
            int temp=max_ending_here;
           max_ending_here=Math.max(arr[i],Math.max(arr[i]*max_ending_here,arr[i]*min_ending_here));
           min_ending_here=Math.min(arr[i],Math.min(arr[i]*min_ending_here,arr[i]*temp));
           max_product=Math.max(max_product,max_ending_here);
        }
        return max_product;
    }
    public static void main(String[] args) {
        int[] arr={-2,0,-1};
        System.out.println(max_product_subArray(arr));

    }
}
