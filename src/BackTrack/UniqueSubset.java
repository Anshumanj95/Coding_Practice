package BackTrack;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class UniqueSubset {
    public static ArrayList <ArrayList<Integer>> AllSubsets(int[] arr, int n)
    {
        // your code here
        ArrayList <ArrayList <Integer>> res=new ArrayList <ArrayList <Integer>>();
        if(arr==null||arr.length==0)
            return res;
        Arrays.sort(arr);
        List<Integer> subset=new ArrayList<>();
        allsubset(arr,res,subset,0);
        res.remove(0);
        return res;
    }
    public static void allsubset(int[] arr,ArrayList <ArrayList <Integer>> res,List<Integer> subset,int start){
        res.add(new ArrayList<>(subset));
        for(int i=start;i<arr.length;i++){
            if(i!=start &&arr[i]==arr[i-1])
                continue;
            subset.add(arr[i]);
            allsubset(arr,res,subset,i+1);
            subset.remove(subset.size()-1);
        }
    }

    public static void main(String[] args) {
        int[] arr={2,1,2};
        AllSubsets(arr,arr.length);

    }
}
