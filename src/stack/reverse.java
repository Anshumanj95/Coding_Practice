package stack;

import java.util.Stack;

public class reverse {
    public static int[] reverseThis(int[] arr){
        Stack<Integer> s=new Stack<>();
        for(Integer s1:arr){
            s.push(s1);
        }
        for(int i=0;i<arr.length;i++){
            arr[i]=s.pop();
        }
        return arr;
    }
    public static void main(String[] args) {
        int[] arr={12,3,5,6,89,9};
        int[] ans=reverseThis(arr);
        for(int s:ans){
            System.out.print(s+" ");
        }
    }
}
