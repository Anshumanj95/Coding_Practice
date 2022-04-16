package PriorityQueue;

import java.util.HashMap;
import java.util.PriorityQueue;

public class TopKthFrequent {
    public static int[] topK(int[] arr,int k){
        HashMap<Integer,Integer> map=new HashMap<>();
        for (int i:arr)
            map.put(i,map.getOrDefault(i,0)+1);
        PriorityQueue<Integer> q=new PriorityQueue<>((n1,n2)->map.get(n1)-map.get(n2));
        for (int i:map.keySet()){
            q.add(i);
            if (q.size()>k)
                q.poll();
        }
        int[] ans=new int[k];
        for (int i=k-1;i>=0;i--){
            ans[i]=q.poll();
        }
        return ans;
    }
    public static void main(String[] args) {

    }
}
