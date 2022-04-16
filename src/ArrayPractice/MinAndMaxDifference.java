package ArrayPractice;

public class MinAndMaxDifference {
    public static int maxDifference(int[] arr){
        int n=arr.length;
        int res=arr[1]-arr[0];
        int minValue=arr[0];
        for(int i=1;i<n;i++){
            res=Math.max(res,arr[i]-minValue);
            minValue=Math.min(arr[i],minValue);
        }
        return res;
    }
    public static void main(String[] args) {
        int[] arr={1,3,1,4,9,4,10};
        System.out.println(maxDifference(arr));
    }
}
