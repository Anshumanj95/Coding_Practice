package Nestedforloop;

import java.util.Scanner;

public class Pattren11 {
    public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            for(int i=1;i<=n;i++){
                for(int j=1;j<=n-i;j++){
                    System.out.print("  ");
                }
                for(int j=1;j<=1;j++){
                  for(int k=1;k<=2*i-1;k++){
                      System.out.print(k+" ");
                  }
                    }
                System.out.println();
                }

                }
            }


