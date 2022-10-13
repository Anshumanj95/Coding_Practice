package SlidingWindow;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class CountDistinctElementsInEveryWindow {
    public static ArrayList<Integer> countDistinctElements(ArrayList<Integer> arr, int k) {

        // Write your code here
        int n=arr.size();
        ArrayList<Integer> ans=new ArrayList<>();
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<k;i++){
            map.put(arr.get(i),map.getOrDefault(arr.get(i),0)+1);
        }
        ans.add(map.size());
        for(int i=k;i<n;i++){
            map.put(arr.get(i),map.getOrDefault(arr.get(i),0)+1);
            if(map.get(arr.get(i-k))==1){
                map.remove(arr.get(i-k));
            }
            else{
                map.put(arr.get(i-k),map.get(arr.get(i-k))-1);
            }
            ans.add(map.size());
        }
        return ans;
    }

    public static void main(String[] args) {

    }
}
