package hash;

import java.util.HashMap;

public class ConcatenateTwoNumbers {
    /*
    Given an array numbers[] of N positive integers and a positive integer X, The task is to find the number of ways that X can be obtained by writing a pair of integers in the array numbers[] next to each other. In other words, find the number of ordered pairs (i,j) such that i != j and X is the concatenation of numbers[i] and numbers[j]
     */
    public static long countPair(int x,int n,int[] numbers){
        HashMap<String ,Integer> map=new HashMap<>();
        for (int i:numbers){
            String curr=Integer.toString(i);
            map.put(curr, map.getOrDefault(curr,0)+1);
        }
        String str=Integer.toString(x);
        long count=0;
        for (int i=1;i<str.length();i++){
            String first=str.substring(0,i);
            String second=str.substring(i);
            if (map.containsKey(first) && map.containsKey(second)){
                if (first.equals(second)){
                    int k=map.get(first);
                    count+= (long) k *(k-1);
                }
                else
                    count+= (long) map.get(first) *map.get(second);
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int[] number={1,212,12,12};
        int x=1212;
        System.out.println(countPair(x, number.length, number));

    }
}
