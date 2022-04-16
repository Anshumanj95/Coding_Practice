package Maths;

public class Collatz_Conjecture {
    public static void collatz(int n){
        int steps=1;
        while (n!=1){
            if(n%2==0){
                n=n/2;
            }
            else{
                n=3*n+1;
            }
            System.out.print(n+" ");
            steps++;
        }
        System.out.println();
        System.out.println(steps);
    }
    public static void main(String[] args) {
        collatz(7);
    }
}
