package Maths;

import java.lang.Math;
import java.util.ArrayList;

public class CircularPrimeNumber {
    private static boolean isPrime(int n){
        if(n==0 || n==1)
            return true;
        if(n==2 || n==3)
            return false;
        for(int i=2; i*i<=n; i++){
            if(n%i==0)
                return true;
        }
        return false;
    }
    public static int isCircularPrime(int n)
    {
        // code here
        ArrayList<Integer> al=new ArrayList<>();
        int nod=extractDigits(n,al);
        System.out.println(al);
        int num=n;
        int d= (int) Math.pow(10,nod-1);
        if(isPrime(num))
            return 0;
        for(int i=1;i<nod;i++){
            int msb=num/d;
            num=(num-(d*msb))*10+msb;
            System.out.println(num);
            if(isPrime(num))
                return 0;
        }
        return 1;
    }
    private static int extractDigits(int n, ArrayList<Integer> al){
        int nOD= 0;
        while(n>0){
            al.add((n%10));
            nOD++;
            n/=10;
        }
        return nOD;
    }

    public static void main(String[] args) {
        System.out.println(isCircularPrime(197));


    }
}
