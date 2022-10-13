package Queue;

import java.util.*;

public class FirstNegativeInEveryWindow {
    public static long[] firstNegative(long[] arr,int n,int k){
        long[] ans=new long[n-k+1];
        Deque<Integer> dq=new LinkedList<>();
        for (int i=0;i<k;i++){
            if (arr[i]<0)
                dq.addLast(i);
        }
        int j=0;
        if (dq.size()>0){
            ans[j++]=arr[dq.peek()];
        }
        else
            ans[j++]=0;
        for (int i=k;i<n;i++){
            if (!dq.isEmpty() && i-dq.peek()>=k)
                dq.removeFirst();
            if(arr[i]<0)
                dq.addLast(i);
            if (dq.size()>0)
                ans[j++]=arr[dq.peek()];
            else
                ans[j++]=0;
        }
        return ans;
    }
    public static void main(String[] args) {
        long[] arr={12, -1, -7, 8, -15, 30, 16, 28};
        System.out.println(Arrays.toString(firstNegative(arr,arr.length,3)));
    }
}
