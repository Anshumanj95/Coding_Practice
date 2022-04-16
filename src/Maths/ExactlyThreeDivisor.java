package Maths;

import java.util.Arrays;

public class ExactlyThreeDivisor {
    public static void Exactly3Divisor(int n){
        boolean[] prime = new boolean[n+1];
        Arrays.fill(prime, true);
        prime[0] = prime[1] = false;

        for (int p = 2; p*p <= n; p++)
        {
            if (prime[p])
            {
                for (int i=p*p; i<=n; i += p)
                    prime[i] = false;
            }
        }
        for (int i=0;  i*i <= n ; i++)
            if (prime[i])
                System.out.print(i*i + " ");
    }
    public static boolean isPrime(int n){
        if(n<=1)
            return false;
        for(int i=2;i*i<=n;i++){
            if(n%i==0)
                return false;
        }
        return true;
    }
    public static int exactly3Divisor(int n){
        int res=0;
        for(int i=2;i*i<=n;i++){
            if(isPrime(i)){
                if(i*i<=n) {
                    System.out.print(i * i + " ");
                    res++;
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(exactly3Divisor(25));
    }
}
