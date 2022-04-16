package lab;

import java.util.Scanner;

public class Exception2 {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        for(int i=arr.length;i>=0;i--){
            try {
                System.out.println(arr[i]/i);
            }
            catch (ArithmeticException e){
                System.out.println("Divide by zero is not possible for index 0");
            }
            catch (ArrayIndexOutOfBoundsException e){
                System.out.println("Cannot go beyond array length");
            }
        }
    }
}
