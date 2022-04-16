package DynamicProgramming;

public class Max_sum_subarray_by_removing_at_most_one_element {
    public static int solve1(int[] arr,int n){
        int sum=arr[0];
        int skip=arr[0];
        int max=arr[0];
        for (int i=1;i<n;i++){
            int temp=sum;
            sum+=arr[i];
            sum =Math.max(sum,arr[i]);
            skip=Math.max(temp,skip+arr[i]);
            temp=Math.max(skip,sum);
            max=Math.max(max,temp);
        }
        return max;
    }
    //as hint explanation
    public static int solve2(int[] arr,int n){
        int[] left=new int[n];
        int[] right=new int[n];
        int max=Integer.MIN_VALUE;
        left[0]=arr[0];
        right[n-1]=arr[n-1];
        for (int i=1;i<n;i++){
            left[i]=Math.max(arr[i],arr[i]+left[i-1]);
            max=Math.max(max,left[i]);

        }
        for (int i=n-2;i>=0;i--){
            right[i]=Math.max(arr[i],arr[i]+right[i+1]);
            max=Math.max(max,left[i]);
        }

        System.out.println();
        for (int i=1;i<n-1;i++){
            max=Math.max(left[i-1]+right[i+1],max);
        }
        return max;
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,-4,5};
        System.out.println(solve1(arr,arr.length));
        System.out.println(solve2(arr, arr.length));

    }
}
