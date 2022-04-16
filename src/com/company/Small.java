package com.company;
import java.util.Scanner;
public class Small {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        int l=sc.nextInt();
        getSmallestAndLargest(str,l);

    }
    public static String getSmallestAndLargest (String s,int k){
        String smallest = s.substring(0, k);
        String largest = "";
        for (int i = 0; i < s.length() - k + 1; i++) {
            if (s.substring(i, i + k).compareTo(smallest) < 0) smallest = s.substring(i, i + k);
            if (s.substring(i, i + k).compareTo(largest) > 0) largest = s.substring(i, i + k);
        }

        return smallest + "\n" + largest;
    }
}

