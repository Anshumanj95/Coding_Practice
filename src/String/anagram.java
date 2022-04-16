package String;

import java.util.Arrays;
import java.util.Scanner;

public class anagram {
    public static void main(String[] args) {
        int[] al = new int[256];
        int[] bl = new int[256];
        boolean isAnagram = true;
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        String a1 = a.toUpperCase();
        String b1 = b.toUpperCase();
        for (char c : a1.toCharArray()) {
            int index = (int) c;
            al[index]++;
        }
        for (char c : b1.toCharArray()) {
            int index = (int) c;
            bl[index]++;
        }
        for (int i = 0; i < 256; i++) {
            if (al[i] == bl[i])
                isAnagram = true;
        }
            if (isAnagram) {
                System.out.println("Anagram");
            } else
                System.out.println("Not Anagram");
//        if(Arrays.equals(al,bl))
//            System.out.println("Anagram");
//        else
//            System.out.println("Not Anagram");
        }
    }
