package Contest;

import java.util.Scanner;

public class toggleTheMiddle {
    public static void main (String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int b=bitCount(n);
            System.out.println(b);
            if(b%2!=0){
                System.out.println(toggle(n,(b/2)+1));
            }
            else
                System.out.println(toggle2(n,(b/2)+1,b/2));

        }
    }
    static int bitCount(int n){
        return (int)((Math.log(n)/Math.log(2))+1);
    }
    static int toggle(int n, int b)
    {
        return (n^(1<<(b-1)));
    }
    static int toggle2(int n, int b1, int b2)
    {
        return ((n^(1<<(b1-1)))^(1<<(b2-1)));
    }
}
