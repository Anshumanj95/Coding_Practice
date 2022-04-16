package Contest;

import java.util.Scanner;

public class Tomjerry {
    public static void main (String[] args) throws java.lang.Exception
    {
        // your code goes here
        try {
            Scanner sc=new Scanner(System.in);
            int t=sc.nextInt();
            while(t-->0){
                int a=sc.nextInt();
                int b=sc.nextInt();
                int c=sc.nextInt();
                int d=sc.nextInt();
                int k=sc.nextInt();
                int dist=Math.abs(a-c)+Math.abs(b-d);
                if(k>=dist && k%2==dist%2){
                    System.out.print("YES\n");
                }
                else{
                    System.out.print("NO\n");
                }
            }
        } catch(Exception e) {
        }
    }
}
