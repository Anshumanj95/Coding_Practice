package ArrayPractice;

public class ArthimeticSlices {
    public static int numberOfArithmeticSubArray(int[] arr){
        if (arr.length<3)
            return 0;
        int total=0;
        int n=arr.length;
        for (int i=2,prev=0;i<n;i++){
            total+=(arr[i]-arr[i-1]==arr[i-1]-arr[i-2])?++prev:(prev=0);
        }
        return total;
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        System.out.println(numberOfArithmeticSubArray(arr));
    }
}
