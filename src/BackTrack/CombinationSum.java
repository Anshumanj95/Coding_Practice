package BackTrack;

import java.util.*;

public class CombinationSum {
    public static ArrayList <ArrayList<Integer>> AllCombination(ArrayList<Integer> A,int B)
    {
        // your code here
        ArrayList <ArrayList <Integer>> res=new ArrayList <>();
        ArrayList<Integer> ans=new ArrayList<>();
        Set<Integer> s=new HashSet<>(A);
        A.clear();
        A.addAll(s);
        Collections.sort(A);
        getall(A,B,0,res,ans);
        return res;
    }
    public static void getall(ArrayList<Integer> A,int B,int index,ArrayList<ArrayList<Integer>> res,ArrayList<Integer> ans){
        if(B==0){
            res.add(new ArrayList<>(ans));
            return;
        }
        for(int i=index;i<A.size();i++){
            if(B-A.get(i)>=0){
                ans.add(A.get(i));
                getall(A,B-A.get(i),i,res,ans);
                ans.remove(A.get(i));
            }
        }
    }

    public static void main(String[] args) {
        ArrayList<Integer> A=new ArrayList<>(Arrays.asList(7,2,6,5));
        int B=16;
        System.out.println(AllCombination(A,B));


    }
}
