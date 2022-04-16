package ArrayPractice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Permute{
    static ArrayList<ArrayList<Integer>> res=new ArrayList<>();
    static ArrayList<ArrayList<Integer>> permute(ArrayList<Integer> arr, int k){
        for(int i = k; i < arr.size(); i++){
            Collections.swap(arr, i, k);
            res=permute(arr, k+1);
            Collections.swap(arr, k, i);
        }
        if (k == arr.size() -1){
           res.add(new ArrayList<>(arr));
        }
        return res;
    }
    public static ArrayList<Integer> fact(int n){
        ArrayList<Integer> ans=new ArrayList<>();
        ans.add(1);
        for(int x=2;x<=n;x++){
            multiply(x,ans);
        }
        Collections.reverse(ans);
        return ans;
    }
    public static void multiply(int x,ArrayList<Integer> ans){
        int carry=0;
        int product=1;
        for(int i=0;i<ans.size();i++){
            int temp=ans.get(i);
            product=ans.get(i)*x+carry;
            temp=product%10;
            ans.remove(i);
            ans.add(i,temp);
            carry=product/10;
        }
        while(carry!=0){
            ans.add(carry%10);
            carry/=10;
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        ArrayList<Integer> arr=new ArrayList<>();
        for (int i=0;i<n;i++)
            arr.add(i+1);
        ArrayList<ArrayList<Integer>> ans=permute(arr,0);
        System.out.println(ans);
        int sum=0;
        for (ArrayList<Integer> curr:ans){
            for (int i=0;i<curr.size();i++){
                sum+=curr.get(i)*(i+1);
            }
        }
        ArrayList<Integer> fact= fact(n);
        StringBuilder s=new StringBuilder();
        for (int i:fact)
            s.append(i);
        System.out.println(s.toString());
        long f=Long.parseLong(s.toString());
        System.out.println(sum/f);
    }
}
