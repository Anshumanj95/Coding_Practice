package Maths;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class HappyNumber {
    public static int getNext(int n){
        int totalSum=0;
        while (n>0){
            int d=n%10;
            n=n/10;
            totalSum+=d*d;
        }
        return totalSum;
    }
    public static boolean isHappy(int n){
        // hashSet For Cycle detection
//        Set<Integer> seen=new HashSet<>();
//        while (n!=1 && !seen.contains(n)){
//            seen.add(n);
//            n=getNext(n);
//        }
        // Floyd cycle detection linkedList
        int slow=n;
        int fast=getNext(n);
        while (fast!=1 && fast!=slow){
            slow=getNext(n);
            fast=getNext(getNext(n));
        }
        return fast==1;
        // if cycle is present is start with 4-16-37-58-89-45-42-20-4
//        while (n!=1 && n!=4)
//            n=getNext(n);
//        return n==1;
    }
    public static void main(String[] args) {


    }
}
