package Contest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class MaximunTrio {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            ArrayList<Integer> arr=new ArrayList<>(n);
            for (int i=0;i<n;i++)
                arr.add(i,sc.nextInt());
            Collections.sort(arr);
            int ai=arr.get(arr.size()-1);
            arr.remove(arr.size()-1);
            int aj=arr.get(0);
            arr.remove(0);
            int ak=arr.get(arr.size()-1);
            System.out.println((ai-aj)*ak);

        }
    }
}
