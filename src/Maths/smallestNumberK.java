package Maths;

import java.util.Stack;

//Smallest number k such that the product of digits of k is equal to n
public class smallestNumberK {
    public static String number(int n){
        if(n>=0 && n<=9){
            return String.valueOf(n);
        }
        Stack<Integer> s=new Stack<>();
        for(int i=9;i>=2 &&n>1;i--){
            while(n%i==0){
                s.push(i);
                n=n/i;
            }
        }
        if(n!=1)
            return String.valueOf(-1);
        long k=0;
        while(!s.isEmpty()){
            k=k*10+s.peek();
            s.pop();
        }
        return String.valueOf(k);
    }
    public static void main(String[] args) {
        int n=100;
        System.out.println(number(n));

    }
}
