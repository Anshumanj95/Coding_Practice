package bits;

import java.util.Scanner;

public class oddEven {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if((n&1)==0){
            System.out.println("Even");
        }
        else
            System.out.println("Odd");
    }
}
