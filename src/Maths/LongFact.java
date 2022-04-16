package Maths;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.Collections;

public class LongFact {
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
    public static void main(String[] args) {
        ArrayList<Integer> ans=fact(5);
        for(int e:ans)
            System.out.print(e);
    }
}
