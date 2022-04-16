package bits;

public class BitWiseAndOfTheArray {
    public static int minimum(int[] arr,int n,int x){
        int ans=n;
        int mask=0;
        for (int i=31;i>=0;i--){
            if (((x>>i)&1)==1){
                mask^=(1<<i);
                continue;
            }
            int temp=mask^(1<<i);
            int count=0;
            for (int j=0;j<n;j++){
                if ((temp&arr[j])!=temp)
                    count++;
            }
            ans=Math.min(ans,count);
        }
        return ans;
    }
    public static void main(String[] args) {

    }
}
