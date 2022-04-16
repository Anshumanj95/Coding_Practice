package ArrayPractice;

import java.util.ArrayList;

public class Flip {
    public static ArrayList<Integer> maxFlip(String a){
        int l=0;
        int lmax=-1;
        int rmax=-1;
        int curr=0;
        int maxa=0;
        for(int i=0;i<a.length();i++){
            if(a.charAt(i)=='0')
                curr++;
            else
                curr--;
            if(curr>maxa){
                maxa=curr;
                lmax=l;
                rmax=i;
            }
            if(curr<0){
                curr=0;
                l=i+1;
            }
        }
        if(lmax == -1){
            ArrayList<Integer> ans=new ArrayList<>();
            return ans;
        }
        ArrayList<Integer> ans=new ArrayList<>();
        ans.add(lmax+1);
        ans.add(rmax+1);
        return ans;
    }
    public static void main(String[] args) {
        String s="010";
        ArrayList<Integer> ans=maxFlip(s);
        System.out.println(ans.toString());
    }
}
