package Contest;

import java.util.Arrays;
import java.util.Scanner;

public class CHEFMGX {
    static int n=(int) 10e7+2;
    static int[] prime=new int[n];
    static int[] fre=new int[n];
    public static void sieveOfEratosthenes(int n){

        Arrays.fill(prime,1);
        prime[0]=0;
        prime[1]=0;
        for(int i=2;i<=n;i++){
            if(prime[i]==1) {
                for (int j = i * i; j <= n; j += i) {
                    prime[j] = 0;
                }
            }
        }
        for (int i=2;i<=n;i++){
            fre[i]=fre[i-1]+prime[i];
        }
    }
    public static void  minimumSteps(int x,int y){
        if(x==1&& y==2) {
            System.out.println(2);
            return;
        }
        if(x==1&& y==3){
            System.out.println(2);
            return;
        }
        if(x==2&& y==3){
            System.out.println(2);
            return;
        }
        int ans=y-x;
        ans=ans-(fre[y]-fre[x]);
        if(prime[x+1]==1)
            ans=ans+1;
        System.out.println(ans);

    }
    public static void main(String[] args) {
        try {
            Scanner sc=new Scanner(System.in);
            int t=sc.nextInt();
            while(t-->0){
                int x=sc.nextInt();
                int y=sc.nextInt();
                sieveOfEratosthenes(y);
                minimumSteps(x,y);
            }
        } catch(Exception ignored) {
        }
    }

}
