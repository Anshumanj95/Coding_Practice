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
    public static int max_product_subArray2(int[] arr){
        int n=arr.length;
        int res=arr[0],l=0,r=0;
        for (int i=0;i<n;i++){
            l=(l==0?1:l)*arr[i];
            r=(r==0?1:r)*arr[n-1-i];
            res=Math.max(res,Math.max(l,r));
        }
        return res;
    }
    public static void main(String[] args) {
        int[] arr={-2,3,-4};
        System.out.println(max_product_subArray(arr));
        System.out.println(max_product_subArray2(arr));

    }
}
