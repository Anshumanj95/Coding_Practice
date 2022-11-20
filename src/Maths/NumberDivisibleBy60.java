package Maths;

public class NumberDivisibleBy60 {
    /*
    any number is divisible by 60 if it’s divisible by 6 and 10.
    means it should be divisible by 3 and 2 and contains 0.

    for 3-> sum of the digits should be divisible by 3
    for 2-> last digit should be 2 or 4 or 6 or 8 or 0
    for 10-> last digit should be 0

     */
    public static boolean isDivisible(int[] arr){
        if (arr.length==1 && arr[0]==0)
            return true;
        int sum=0;
        boolean containEven=false;
        boolean containZero=false;
        for (int x:arr){
            if (x==0)
                containZero=true;
            else if (x%2==0)
                containEven=true;
            sum+=x;
        }
        return containEven && containZero && sum % 3 == 0;
    }
    public static void main(String[] args) {
        int[] arr={1,0,8};
        System.out.println(isDivisible(arr));
    }
}
