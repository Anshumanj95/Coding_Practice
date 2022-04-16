package Contest;

import java.util.Collections;
import java.util.Scanner;
import java.util.Stack;

public class BirthdayGift {
    public static void main(String[] args) {
        try {
            Scanner sc=new Scanner(System.in);
            int t=sc.nextInt();
            while(t-->0){
                int n=sc.nextInt();
                int k=sc.nextInt();
                Stack<Integer> arr=new Stack<>();
                for(int i=0;i<n;i++){
                    arr.add(sc.nextInt());
                }
                Collections.sort(arr);
                int s1=0,s2=0;
                while(k-->0){
                    s1+=arr.pop();
                    s2+=arr.pop();
                }
                s2+=arr.pop();
                System.out.println(Math.max(s1,s2));
            }
        } catch(Exception e) {
        }
    }
}
