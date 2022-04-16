package bits;

import java.util.ArrayList;

public class printPowerSet {
    public static ArrayList<ArrayList<Character>> print(String str){
        int n=str.length();
        int powsize= (int) Math.pow(2,n);
        ArrayList<ArrayList<Character>> ans=new ArrayList<>();
        for(int counter=0;counter<powsize;counter++){
            ArrayList<Character> curr=new ArrayList<>();
            for(int j=0;j<n;j++){
                if((counter&(1<<j))!=0)
                    curr.add(str.charAt(j));
            }
            ans.add(curr);
        }
        return ans;
    }
    public static void main(String[] args) {
        String s="abc";
        System.out.println(print(s));;
    }
}
