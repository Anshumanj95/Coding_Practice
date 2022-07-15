package PriorityQueue;

import java.util.*;

public class TopKFrequentWord {
    public static List<String> topKFrequent(String[] words, int k){
        PriorityQueue<Map.Entry<String,Integer>> pq=new PriorityQueue<>(
                (a,b)-> Objects.equals(a.getValue(), b.getValue()) ?a.getKey().compareTo(b.getKey()):b.getValue()-a.getValue()
        );
        ArrayList<String> ans=new ArrayList<>();
        HashMap<String,Integer> map=new HashMap<>();
        for (String i:words)
            map.put(i,map.getOrDefault(i,0)+1);
        pq.addAll(map.entrySet());
        while (!pq.isEmpty() && k>0){
            ans.add(pq.poll().getKey());
            k--;
        }
        return ans;
    }
    public static void main(String[] args) {
        String[] word={"the","day","is","sunny","the","the","the","sunny","is","is"};
        System.out.println(topKFrequent(word,4));
    }
}
