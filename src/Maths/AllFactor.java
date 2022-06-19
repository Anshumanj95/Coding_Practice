package Maths;

import java.util.ArrayList;
import java.util.Collections;

public class AllFactor {
    public static ArrayList<Integer> findAllFActor(int n){
        ArrayList<Integer> ans=new ArrayList<>();
        for(int i=1;i*i<=n;i++){
            if(n%i==0){
                ans.add(i);
                if(i!=n/i)
                    ans.add(n/i);
            }
        }
        Collections.sort(ans);
        return ans;
    }
    public static ArrayList<Integer> findAllFactors(int n){
        ArrayList<Integer> ans=new ArrayList<>();
        int i;
        for(i=1;i*i<n;i++){
            if(n%i==0)
                ans.add(i);
        }
        for(;i>=1;i--){
            if(n%i==0)
                ans.add(n/i);
        }
        return ans;
    }
    public static void main(String[] args) {
        ArrayList<Integer> ans=findAllFactors(105);
        for(int i=0;i< ans.size();i++){
            System.out.print(ans.get(i)+" ");
        }
    }
}
