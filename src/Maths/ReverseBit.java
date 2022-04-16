package Maths;

import java.util.Arrays;
import java.util.BitSet;

public class ReverseBit {
    public static long reverse(long n){
        int[] bits=new int[32];
        int i=31;
        while (n!=0){
            bits[i--]= (int) (n%2);
            n=n/2;
        }
        System.out.println(Arrays.toString(bits));
        StringBuilder s=new StringBuilder();
        for (int j:bits)
            s.append(j);
        System.out.println(s.reverse());
        return Long.parseLong(s.toString(),2);
    }
    public static void main(String[] args) {
        System.out.println(reverse(1));
    }
}
