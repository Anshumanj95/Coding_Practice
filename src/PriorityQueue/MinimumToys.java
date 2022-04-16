package PriorityQueue;
import java.util.*;
public class MinimumToys {
    public static int NoOfToys(int[] arr,int sum){
        PriorityQueue<Integer> p=new PriorityQueue<>();
        for(int e:arr){
            p.add(e);
        }
        int res=0;
        while(sum>=0&&!p.isEmpty()&&p.peek()<=sum){
            sum=sum-p.poll();
            res++;
        }
        return res;
    }
    public static void main(String[] args) {
    int[] arr={5,4,3,2,1};
        System.out.println(NoOfToys(arr,8));
    }
}
