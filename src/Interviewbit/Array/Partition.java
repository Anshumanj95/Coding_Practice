package Interviewbit.Array;

public class Partition {

    //Count the number of ways to split all the elements of the array into 3 contiguous parts so that the sum of elements in each part is the same.
    public static int countWays(int[] arr){
        int total=0;
        for (int i:arr)
            total+=i;
        if (total%3!=0)
            return 0;
        int one_third=total/3;
        int two_third=2*one_third;
        int count=0;
        int one_third_count=0;
        int sum=0;
        for (int i=0;i<arr.length-1;i++){
            sum+=arr[i];
            if (sum==two_third)
                count+=one_third_count;
            if (sum==one_third)
                one_third_count++;
        }
        return count;
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,0,3};
        System.out.println(countWays(arr));
    }
}
