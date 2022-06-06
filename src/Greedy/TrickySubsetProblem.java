package Greedy;

import java.util.ArrayList;

public class TrickySubsetProblem {
    public static boolean isPossible(Long s,int n,Long x,Long[] a){
        ArrayList<Long> arr=new ArrayList<>();
        arr.add(s);
        long curr=s;
        for (int i=0;i<n;i++){
            long temp=curr+a[i];
            arr.add(temp);
            if (temp>=x)
                break;
            curr+=temp;
        }
        int i=arr.size()-1;
        while (i>=0 && x>0){
            if (x>=arr.get(i))
                x-=arr.get(i);
            i--;
        }
        return x == 0;
    }
    public static void main(String[] args) {
        Long[] arr={1L,2L,4L,2L};
        System.out.println(isPossible(1L,arr.length,7L,arr));
    }
}
