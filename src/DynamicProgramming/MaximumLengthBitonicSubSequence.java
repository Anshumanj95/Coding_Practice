package DynamicProgramming;

public class MaximumLengthBitonicSubSequence {
    public static int maxLengthBSub(int[] arr,int n){
        int[] lis=new int[n];
        int[] lds=new int[n];
        lis[0]=1;
        lds[n-1]=1;
        for (int i=1;i<n;i++){
            lis[i]=1;
            for (int j=0;j<i;j++)
                if (arr[i]>arr[j])
                    lis[i]=Math.max(lis[i],1+lis[j]);
        }
        for (int i=n-2;i>=0;i--){
            lds[i]=1;
            for (int j=n-1;j>i;j--){
                if (arr[i]>arr[j])
                    lds[i]=Math.max(lds[i],1+lds[j]);
            }
        }
        int res=0;
        for (int i=1;i<n-1;i++)
            res=Math.max(res,lds[i]+lis[i]-1);
        return res;
    }
    public static int Minimum_Number_of_Removals_to_Make_Mountain_Array(int[] nums){
        int n= nums.length;
        int max=maxLengthBSub(nums,nums.length);
        if (max==0)
            return n-1;
        return n-max;
    }
    public static void main(String[] args) {
        int[] arr={100,92,89,77,74,66,64,66,64};

        System.out.println(Minimum_Number_of_Removals_to_Make_Mountain_Array(arr));
    }
}
