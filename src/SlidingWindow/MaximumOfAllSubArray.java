package SlidingWindow;

import java.util.ArrayDeque;
import java.util.Arrays;

public class  MaximumOfAllSubArray {
    public static int[] max(int[] arr,int n,int k){
        int[] ans=new int[n-k+1];
        ArrayDeque<Integer> dq=new ArrayDeque<>();
        for(int i=0;i<k;i++){
            while (!dq.isEmpty()&&arr[i]>=arr[dq.peekLast()])
                dq.removeLast();
            dq.addLast(i);
        }
        int j=0;
        for(int i=k;i<n;i++){
            ans[j++]=arr[dq.peek()];
            while (!dq.isEmpty() && dq.peekFirst()<=i-k)
                dq.removeFirst();
            while (!dq.isEmpty() && arr[i]>=arr[dq.peekLast()])
                dq.removeLast();
            dq.addLast(i);
        }
        ans[j]=arr[dq.peek()];
        return ans;
    }
    public static void main(String[] args) {
        int[] arr={1,3,1,2,0,5};
        System.out.println(Arrays.toString(max(arr,arr.length,3)));
    }
}
