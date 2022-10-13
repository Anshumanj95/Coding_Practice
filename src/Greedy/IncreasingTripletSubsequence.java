package Greedy;

public class IncreasingTripletSubsequence {
    // return true if i<j<k and arr[i]<arr[j]<arr[k]
    public static boolean increasingTriplet(int[] arr){
        int first=Integer.MAX_VALUE;
        int second=Integer.MAX_VALUE;
        for (int i:arr){
            if (i<first)
                first=i;
            else if (i<second && i!=first)
                second=i;
            if (i>first && i>second)
                return true;
        }
        return false;
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        int[] arr2={5,4,3,2,1};
        int[] arr3={2,1,5,0,4,6};
        System.out.println(increasingTriplet(arr));
        System.out.println(increasingTriplet(arr2));
        System.out.println(increasingTriplet(arr3));
    }
}
