package Contest;

import javax.swing.plaf.IconUIResource;
import java.util.Arrays;
import java.util.Scanner;

public class ChefLoves1010 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            String s=sc.next();
            char[] arr=s.toCharArray();
            int ones=0;
            int zeros=0;
            for(char i:arr){
                if(i=='1')
                    ones++;
                else
                    zeros++;
            }
            if (ones==0||zeros==0)
                System.out.println(0);
            else
                System.out.println(Math.min(ones,zeros)-1);


        }
    }
}
