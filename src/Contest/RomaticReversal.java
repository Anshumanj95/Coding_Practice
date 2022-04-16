package Contest;

import java.util.Scanner;

public class RomaticReversal {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int k=sc.nextInt();
            String s=sc.next();
            StringBuilder s1=new StringBuilder();
            int i=0;
            int j=k-1;
            while (i<j){
                s1.append(s.charAt(i++));
                s1.append(s.charAt(j--));
            }
            if (i==j)
            s1.append(s.charAt(i));
            s1.reverse();
            System.out.println(s1+s.substring(k));

        }
    }
}
