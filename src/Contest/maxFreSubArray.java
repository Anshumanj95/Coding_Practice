package Contest;

import com.sun.security.jgss.GSSUtil;

import java.util.*;
import java.util.stream.Collectors;

public class maxFreSubArray {
    public static int  subArray(int[] arr){
        int n=arr.length;
        HashMap<ArrayList<Integer>,Integer> h=new LinkedHashMap<>();
        int max_end_here=0;
        ArrayList<Integer> a=new ArrayList<>();
        int  max_so_far=Integer.MIN_VALUE;
        for(int i=0;i<n;i++) {
            a.add(arr[i]);
            max_end_here += arr[i];
            if(arr[i]>max_end_here){
                max_end_here=arr[i];
            }
            if(max_so_far<max_end_here){
                max_so_far =max_end_here;
            }
            h.put(a,h.getOrDefault(a,0)+1);
        }
        System.out.println(h);
        return  max_so_far;
        }
    public static int  subArray2(int[] arr){
        int n=arr.length;
        HashMap<ArrayList<Integer>,Integer> h=new LinkedHashMap<>();

        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                ArrayList<Integer> a=new ArrayList<>();
                for(int k=i;k<=j;k++){
                    a.add(arr[k]);
                }
                h.put(a,h.getOrDefault(a,0)+1);
            }
        }
        ArrayList<Long> ans=new ArrayList<>();
        for(Map.Entry<ArrayList<Integer>,Integer> aa:h.entrySet()){
            ans.add(aa.getKey().stream().mapToLong(i->i).sum()*aa.getValue());
        }
        ans.sort(Collections.reverseOrder());
        Long l= ans.get(0);
        return l.intValue();
    }

    public static void main(String[] args) {
        int[] arr={10,8,-20,5,5,5};
        int max=subArray(arr);
        System.out.println(max);
    }
}
