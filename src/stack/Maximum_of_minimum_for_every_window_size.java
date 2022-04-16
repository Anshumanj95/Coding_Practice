package stack;

import java.util.Arrays;
import java.util.Stack;

public class Maximum_of_minimum_for_every_window_size {
    public static int[] maxOfmin(int[] arr,int n){
        Stack<Integer> s=new Stack<>();
        int[] left=new int[n];
        int[] right=new int[n];
        Arrays.fill(left,-1);
        Arrays.fill(right,n);
        for (int i=0;i<n;i++){
            while (!s.isEmpty()&& arr[s.peek()]>=arr[i])
                s.pop();
            if (!s.isEmpty())
                left[i]=s.peek();
            s.push(i);
        }
        while (!s.isEmpty())
            s.pop();
        for (int i=n-1;i>=0;i--){
            while (!s.isEmpty() && arr[s.peek()]>=arr[i])
                s.pop();
            if (!s.isEmpty())
                right[i]=s.peek();
            s.push(i);
        }
        int[] ans=new int[n+1];
        for (int i=0;i<n;i++){
            int len=right[i]-left[i]-1;
            ans[len]=Math.max(ans[len],arr[i]);
        }
        for (int i=n-1;i>=0;i--){
            ans[i]=Math.max(ans[i],ans[i+1]);
        }
        int[] result=new int[n];
        for (int i=0;i<n;i++){
            result[i]=ans[i+1];
        }
        return result;
    }
    public static void main(String[] args) {
        int[] arr={10,20,30,50,10,70,30};
        System.out.println(Arrays.toString(maxOfmin(arr, arr.length)));

    }
}
