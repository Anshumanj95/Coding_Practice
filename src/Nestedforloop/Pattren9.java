package Nestedforloop;

import java.util.Scanner;

public class Pattren9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            if (i <= 5) {
                for (int j = 1; j <= (n / 2 - i + 1); j++) {
                    System.out.print("  ");
                }
                for (int j = 1; j <= i; j++) {
                    System.out.print("* ");
                }
            } if(i>5){
                for (int j = 1; j <= (n / 2 - i + 1) * (-1); j++) {
                    System.out.print("  ");
                }
                for (int j = 1; j <= n-i+1; j++) {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    }
}
