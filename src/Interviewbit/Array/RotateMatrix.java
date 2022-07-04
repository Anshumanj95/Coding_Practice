package Interviewbit.Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class RotateMatrix {
    public static void rotate(ArrayList<ArrayList<Integer>> arr){
        int n=arr.size();
        for (int i=0;i<n;i++){
            for (int j=0;j<i;j++){
                Integer temp=arr.get(i).get(j);
                arr.get(i).set(j,arr.get(j).get(i));
                arr.get(j).set(i,temp);
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n/2; j++) {
                int temp=arr.get(i).get(j);
                arr.get(i).set(j,arr.get(i).get(n-1-j));
                arr.get(i).set(n-1-j,temp);

            }

        }
        for (ArrayList<Integer> list:arr){
            for (int i:list){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        ArrayList<ArrayList<Integer>> arr=new ArrayList<>();
        for (int i=0;i<n;i++){
            ArrayList<Integer> curr=new ArrayList<>();
            for (int j = 0; j < n; j++) {
                curr.add(sc.nextInt());
            }
            arr.add(curr);
        }
        rotate(arr);

    }
}
