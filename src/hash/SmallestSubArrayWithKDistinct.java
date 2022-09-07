package hash;

import java.util.ArrayList;
import java.util.HashMap;

public class SmallestSubArrayWithKDistinct {
    public static ArrayList<Integer> SmallestKDistinct(int[] arr, int k){
        HashMap<Integer,Integer> map=new HashMap<>();
        ArrayList<Integer> ans=new ArrayList<>();
        int i=0,j=0;
        int maxi=0,maxj=Integer.MAX_VALUE;
        int n=arr.length;
        while ( j<=n){
            if (j==n && map.size()<k)
                break;
            if (map.size()<k){
                map.put(arr[j],map.getOrDefault(arr[j],0)+1);
                j++;
            }
            else if (map.size()==k){
                if (j-i<maxj-maxi){
                    maxi=i;
                    maxj=j;
                }
                map.put(arr[i],map.get(arr[i])-1);
                if (map.get(arr[i])==0)
                    map.remove(arr[i]);
                i++;
            }
        }
        if (map.size()==k){
            if (j-i<maxj-maxi){
                maxi=i;
                maxj=j;
            }
        }
        if (maxi==0 && maxj==Integer.MAX_VALUE)
            ans.add(-1);
        else{
            ans.add(maxi);
            ans.add(maxj-1);
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr={1,2,1,2,3};
        System.out.println(SmallestKDistinct(arr,3));
    }
}
