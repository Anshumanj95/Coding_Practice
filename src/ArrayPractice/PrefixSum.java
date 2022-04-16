package ArrayPractice;

public class PrefixSum {
    public static int[] prefix(int[] arr){
        int n=arr.length;
        int[] prefix=new int[n];
        prefix[0]=arr[0];
        for(int i=1;i<n;i++){
            prefix[i]=prefix[i-1]+arr[i];
        }
        return prefix;
    }
    public static int SumInRange(int[] prefix,int l,int r){
        if(l!=0)
            return prefix[r]-prefix[l-1];
        else
            return prefix[r];
    }
    //maximum range up to 1000
    public static int MaximumOccuringElement(int[] l,int [] r){
        int[] arr=new int[1000];
        int n=l.length;
        for(int i=0;i<n;i++){
            arr[l[i]]++;
            arr[r[i]+1]--;
        }
        int maxo=arr[0];
        int res=0;
        for(int i=1;i<1000;i++){
            arr[i]+=arr[i-1];
            if(maxo<arr[i]){
                maxo=arr[i];
                res=i;
            }
        }
        return res;

    }
    public static void main(String[] args) {
        int[] l={1,2,3};
        int[] r={3,5,7};
        System.out.println(MaximumOccuringElement(l,r));
    }
}
