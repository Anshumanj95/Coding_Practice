package ArrayDeque;


import java.util.ArrayDeque;
import java.util.Deque;

public class MaximumAllSubarray {
    public static void maximum(int[] arr,int k){
        Deque<Integer> d=new ArrayDeque<>();
        for(int i=0;i<k;i++){
            while(!d.isEmpty()&&arr[i]>=arr[d.peekLast()])
                d.removeLast();
            d.addLast(i);
        }
        for(int i=k;i<arr.length;i++){
            System.out.println(arr[d.peekFirst()]);
            while(!d.isEmpty()&&d.peekFirst()<=i-k)
                d.removeFirst();
            while(!d.isEmpty()&&arr[i]>=arr[d.peekLast()])
                d.removeLast();
            d.addLast(i);
        }
        System.out.println(arr[d.peekFirst()]);
    }
    public static void main(String[] args) {
        int[] arr={20,40,30,10,60};
        maximum(arr,3);
    }
}
