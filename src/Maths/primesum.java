package Maths;

import java.util.ArrayList;
import java.util.Arrays;

public class primesum {
    public static ArrayList<Integer> prime(int n){
        ArrayList<Integer> ans=new ArrayList<>();
        boolean[] isPrime=new boolean[n+1];
        Arrays.fill(isPrime,true);
        isPrime[0]=false;
        isPrime[1]=false;
        for(int i=2;i*i<=n;i++){
            for(int j=2*i;j<=n;j+=i){
                isPrime[j]=false;
            }
        }
        for(int i=1;i<=n;i++){
            if(isPrime[i])
                ans.add(i);
        }
        return ans;
    }
    public static ArrayList<Integer> primeSum(int A) {
        ArrayList<Integer> prime=prime(A);
        ArrayList<Integer> ans=new ArrayList<>();
        int l=0;
        int h=prime.size()-1;
        while(l<=h){
            if(prime.get(l)+prime.get(h)==A){
                ans.add(prime.get(l));
                ans.add(prime.get(h));
                l++;
                h--;
            }
            else if(prime.get(l)+prime.get(h)<A)
                l++;
            else
                h--;
        }
        return ans;
    }

    public static void main(String[] args) {
        ArrayList<Integer> prime=primeSum(16);
        for(int i=0;i<prime.size();i++){
            System.out.print(prime.get(i)+" ");
        }
    }
}
