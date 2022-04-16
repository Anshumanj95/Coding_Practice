package com.company;

import java.awt.image.AreaAveragingScaleFilter;
import java.util.ArrayList;
import java.util.Arrays;

public class subArraySum {
    public static ArrayList<Integer> sum(int[] arr,int sum){
        ArrayList<Integer> ans=new ArrayList<>();
        int csum,i,j;
        for(i=0;i<arr.length;i++){
            csum=arr[i];
            for(j=i+1;j<=arr.length;j++){
                if (csum == sum) {
                    int p = j - 1;
                    ans.add(i+1);
                    ans.add(p+1);
                    return ans;
                }
                if (csum > sum || j == arr.length)
                    break;
                csum = csum+ arr[j];
            }
        }
        return ans;
    }
    static ArrayList<Integer> leaders(int arr[], int n){
        ArrayList<Integer> ans=new ArrayList<>();
        for(int i=1;i<n-1;i++){
            if(arr[i-1]<arr[i]&&arr[i]>arr[i+1]){
                if(arr[i-1]>=arr[i+1])
                    break;
                int j=arr[i];
                ans.add(j);
            }
        }
        int k=arr[n-1];
        ans.add(k);
        System.out.println(k);
        return ans;
    }
    public static ArrayList<Integer> quadraticRoots(int a, int b, int c) {
        ArrayList<Integer> ans=new ArrayList<>();
        int d=(int)(b*b)-(4*a*c);
        System.out.println(d);
        if(d>=0){
            System.out.println("in");
            int root1=(int)(-(b+d)/2*a);
            System.out.println(root1);
            int root2=(int)(-(b-d)/2*a);
            System.out.println(root2);
            if(root1>=root2)
                ans.add(root2);
            else
                ans.add(root1);
        }
        else
            ans.add(-1);
        return ans;

    }
    public static void main(String[] args) {
        int a=1;
        int b=-2;
        int c=1;
        ArrayList<Integer> ans=quadraticRoots(a,b,c);
        for(int i=0;i<ans.size();i++){
            System.out.println(ans.get(i));
        }



    }
}
