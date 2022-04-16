package Maths;

public class NthNaturalNumber {
    /*Given a positive integer N. You have to find Nth natural number after removing all the numbers containing digit 9.
    Hint-It is known that, digits of base 2 numbers varies from 0 to 1. Similarly, digits of base 10 numbers varies from 0 to 9.
    Therefore, the digits of base 9 numbers will vary from 0 to 8.
    It can be observed that Nth number in base 9 is equal to Nth number after skipping numbers containing digit 9.
    So the task is reduced to find the base 9 equivalent of the number N.

     */
    public static int Number(int n){
        int temp=1;
        int ans=0;
        while (n>0){
            ans+=temp*(n%9);
            n=n/9;
            temp=temp*10;
        }
        return ans;

    }
    public static void main(String[] args) {
        System.out.println(Number(9));
    }
}
