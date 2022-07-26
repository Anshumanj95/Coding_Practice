package Maths;

public class FibonacciNumber {
    //0,1,1,2,3,5,....
    public static int fib(int n){
        if (n==0||n==1)
            return n;
        int prev_prev=0;
        int prev=1;
        int ans=0;
        while (--n>0){
            ans=prev_prev+prev;
            prev_prev=prev;
            prev=ans;
        }
        return ans;
    }
    // 0,1,1,2,4,7,...
    public static int Tribonacci(int n){
        if (n==0|| n==1)
            return n;
        if (n==2)
            return 1;
        int ppp=0,pp=1,p=1,ans=0;
        n=n-2;
        while (n-->0){
            ans=ppp+pp+p;
            ppp=pp;
            pp=p;
            p=ans;
        }
        return ans;
    }
    public static void main(String[] args) {
        System.out.println(fib(5));
        System.out.println(Tribonacci(5));
    }
}
