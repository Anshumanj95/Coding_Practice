package Contest;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class TotalComponents {
    static int N=(int)1e7+2;
    static boolean[] prime=new boolean[N];
    static int[] prefix_prime=new int[N];
    public static void sieve(){
        Arrays.fill(prime,true);
        prime[0]=false;
        prime[1]=false;
        for(int i=2;i*i<N;i++){
            if(prime[i]){
                for(int j=i*i;j<N;j+=i){
                    prime[j]=false;
                }
            }
        }
    }
    public static void pre(){
        int count=0;
        int i;
        for(i=1;i<N;i++){
            if(prime[i])
                count++;
            prefix_prime[i]=count;
        }
    }
    public static void main(String[] args){
        sieve();
        pre();
        try {
            Scanner sc=new Scanner(System.in);
            int t=sc.nextInt();
            while(t-->0){
                int n=sc.nextInt();
                if(n==2)
                    System.out.println(1);
                else if(n==3)
                    System.out.println(2);
                else{
                    int lim=n/2;
                    int extra=prefix_prime[n]-prefix_prime[lim];
                    int groups=1+extra;
                    System.out.println(groups);
                }
            }
        }catch (Exception e){

        }

    }
}
