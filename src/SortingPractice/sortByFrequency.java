package SortingPractice;
import java.net.Inet4Address;
import java.util.*;
public class sortByFrequency {
    public static int[] sort(int[] arr){
        Map<Integer,Integer> m=new HashMap<>();
        for(int x:arr){
            m.put(x,m.getOrDefault(x,0)+1);
        }
        List<Map.Entry<Integer,Integer>> list=new ArrayList<>(m.entrySet());
        list.sort((a1, a2) -> a1.getValue() == a2.getValue() ? a1.getKey() - a2.getKey() : a2.getValue() - a1.getValue());
        int index=0;
        for(Map.Entry<Integer,Integer> e:list){
            for(int i=0;i<e.getValue();i++){
                arr[index++]=e.getKey();
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        int[] arr={10,30,30,20,5,5,5,4,4,3,3,3,3};
        int[] ans=sort(arr);
        for(int e:ans)
            System.out.print(e+" ");
    }
}
