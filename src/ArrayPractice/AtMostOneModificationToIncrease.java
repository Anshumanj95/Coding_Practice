package ArrayPractice;

public class AtMostOneModificationToIncrease {
    public static boolean isPossible(int[]arr){
        int count=0;
        for (int i=0;i<arr.length-1;i++){
            //for sorted part
            if (arr[i]<=arr[i+1])
                continue;
            else
                count++;
            if (i>0){
                if (arr[i+1]<arr[i-1])
                    arr[i+1]=arr[i];
            }
        }
        if (count<=1)
            return true;
        return false;
    }
    public static void main(String[] args) {
        int[] arr={-2,7,-1,0,1,2};
        System.out.println(isPossible(arr));
        int[] arr2={8,4,2,1};
        System.out.println(isPossible(arr2));
    }
}
