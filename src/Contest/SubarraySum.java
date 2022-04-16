package Contest;
import java.util.*;
//find largest subArray sum with condition subArray start and end with same element
public class SubarraySum {
    public static int Maximum(ArrayList<Integer> arr){
        int n=arr.size();
        int[] pr=new int[n];
        pr[0]=arr.get(0);
        for(int i=1;i<n;i++){
            pr[i]=pr[i-1]+arr.get(i);
        }
        HashMap<Integer,Integer> m1=new HashMap<>();
        int ans=0;
        for(int i=0;i<n;i++){
            int x=arr.get(i);
            if(!m1.containsKey(x)){
                ans=Math.max(ans,x);
                m1.put(arr.get(i),i);
            }
            else{
                int pre=m1.get(x);
                ans=Math.max(ans,pr[i]-pr[pre]+arr.get(pre));
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        ArrayList<Integer> al=new ArrayList<>();
        //4 3 1 2 4 2 5 3 6
        al.add(4);
        al.add(3);
        al.add(1);
        al.add(2);
        al.add(4);
        al.add(2);
        al.add(5);
        al.add(3);
        al.add(6);
        System.out.println(Maximum(al));









    }
}
