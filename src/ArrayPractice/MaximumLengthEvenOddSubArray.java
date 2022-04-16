package ArrayPractice;

public class MaximumLengthEvenOddSubArray {
    public static int EvenOddSubArray(int[] arr){
        int n=arr.length;
        int res=1;
        for(int i=0;i<n;i++){
            int count=1;
            for(int j=i+1;j<n;j++){
                if(((arr[j]&1)==0) && ((arr[j-1]&1)!=0)||(((arr[j]&1)!=0) && ((arr[j-1]&1)==0))){
                    count++;
                }
                else
                    break;
            }
            res=Math.max(count,res);
        }
        return res;
    }
    public static int EvenOddSubArrayByKadane(int[] arr){
        int n=arr.length;
        int res=1;
        int count=1;
        for(int i=1;i<n;i++){
            if(((arr[i]&1)==0) && ((arr[i-1]&1)!=0)||(((arr[i]&1)!=0) && ((arr[i-1]&1)==0))){
                count++;
                res=Math.max(count,res);
            }
            else
                count=1;
        }
        return res;
    }
    public static void main(String[] args) {
        int[] arr={10,20,3,5};
        System.out.println(EvenOddSubArray(arr));
        System.out.println(EvenOddSubArrayByKadane(arr));
    }
}
