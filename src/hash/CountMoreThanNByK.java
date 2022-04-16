package hash;

import java.util.HashMap;
import java.util.Map;

public class CountMoreThanNByK {
    public static void printNByk(int[] arr,int k){
        HashMap<Integer,Integer> h=new HashMap<>();
        for(int e:arr)
            h.put(e,h.getOrDefault(e,0)+1);
        for(Map.Entry<Integer,Integer> x:h.entrySet()){
            if(x.getValue()>arr.length/k)
                System.out.print(x.getKey()+" ");
            
        }
    }
    //Extension of Morre Voting algo for n is large and k is less
    public static void printNByK2(int[] arr,int k){
        HashMap<Integer,Integer> h=new HashMap<>();

        for(int i=0;i<arr.length;i++){
            if(h.containsKey(arr[i])){
               h.put(arr[i],h.getOrDefault(arr[i],0)+1);
            }
            else if(h.size()<k-1){
                h.put(arr[i],1);
            }
            else{
                for(Map.Entry<Integer,Integer> x:h.entrySet()){
                    h.put(x.getKey(),x.getValue()-1);
                    if(x.getValue()==0)
                        h.remove(x.getKey());
                }
            }
        }
        for(Map.Entry<Integer,Integer> x:h.entrySet()){
            int count=0;
            for(int i=0;i<arr.length;i++){
                if(x.getKey()==arr[i])
                    count++;
            }
            if(count>arr.length/k)
                System.out.print(x.getKey()+" ");
        }
    }
    public static void main(String[] args) {
        int[] arr={1,3,2,1,3,1,3,3,2};
        printNByK2(arr,4);
    }
}
