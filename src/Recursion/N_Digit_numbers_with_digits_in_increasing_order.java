package Recursion;

import java.util.ArrayList;

public class N_Digit_numbers_with_digits_in_increasing_order {
    public static ArrayList<Integer> increasingNum(int n){
        ArrayList<Integer> nums=new ArrayList<>();
        if (n==1){
            for (int i=0;i<10;i++)
                nums.add(i);
        }
        if (n>1){
            forNums(0,0,n,nums);
        }
        return nums;
    }
    public static void  forNums(int num,int nodsf,int n,ArrayList<Integer> nums){
        if (nodsf==n){
            nums.add(num);
            return;
        }
        for (int i=(num%10+1);i<10;i++)
            forNums(num*10+i,nodsf+1,n,nums);
    }
    public static void main(String[] args) {
        System.out.println(increasingNum(2));
    }
}
