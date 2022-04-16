package ArrayPractice;

import java.util.Arrays;

public class MinimumSum {
    public static String solve(int[] arr, int n) {
        // code here
        if(arr==null||n==0)
            return "";
        Arrays.sort(arr);
        StringBuilder s1=new StringBuilder();
        StringBuilder s2=new StringBuilder();
        for (int i=0;i<n;i++){
            if(i%2==0){
                s1.append(arr[i]);
            }
            else{
                s2.append(arr[i]);
            }
        }
        return findMinimumSum(s1.toString(), s2.toString());
    }
    public static String findMinimumSum(String s1, String s2) {
        StringBuilder result = new StringBuilder();
        int i = s1.length() - 1;
        int j = s2.length() - 1;
        int carry = 0;
        while (i >= 0 && j >=0) {
            int currentNumber = s1.charAt(i) - '0' + s2.charAt(j) - '0' + carry;
            carry = currentNumber / 10;
            if (currentNumber > 0)
                result.append(currentNumber % 10);
            i--;
            j--;
        }
        while (i >= 0) {
            int currentNumber = s1.charAt(i) - '0' + carry;
            carry = currentNumber / 10;
            if (currentNumber > 0)
                result.append(currentNumber % 10);
            i--;
        }
        while (j >= 0) {
            int currentNumber = s2.charAt(j) - '0' + carry;
            carry = currentNumber / 10;
            if (currentNumber > 0)
                result.append(currentNumber % 10);
            j--;
        }
        if (carry > 0) {
            result.append(carry);
        }
        return result.reverse().toString();
    }
    public static void main(String[] args) {
        int[] arr={3,5,0,4,7};
        System.out.println(solve(arr,arr.length));

    }
}
