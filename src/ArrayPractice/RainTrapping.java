package ArrayPractice;

public class RainTrapping {
    public static int maxTrap(int[] arr){
        int n=arr.length;
        int res=0;
        int[] lmax=new int[n];
        lmax[0]=arr[0];
        for(int i=1;i<n;i++)
            lmax[i]=Math.max(arr[i],lmax[i-1]);
        int[] rmax=new int[n];
        rmax[n-1]=arr[n-1];
        for(int i=n-2;i>=0;i--)
            rmax[i]=Math.max(arr[i],rmax[i+1]);
        for(int i=1;i<n-1;i++)
            res+=Math.min(lmax[i],rmax[i])-arr[i];
        return res;
    }
    public static int maxTrap2(int[] arr){
        int n=arr.length;
        int left=0,right=n-1,left_max=0,right_max=0,ans=0;
        while (left<right){
            if (arr[left]<arr[right]){
                if (arr[left]>=left_max)
                    left_max=arr[left];
                else
                    ans+=(left_max-arr[left]);
                left++;
            }
            else{
                if (arr[right]>=right_max)
                    right_max=arr[right];
                else
                    ans+=(right_max-arr[right]);
                right--;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr={5,0,1,2,3};
        System.out.println(maxTrap(arr));
        System.out.println(maxTrap2(arr));

    }
}
