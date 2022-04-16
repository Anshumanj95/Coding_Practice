package stack;

import java.util.ArrayDeque;
import java.util.Deque;

public class Largest_Rectangular_Area_in_a_Histogram {
    public static int[] previousSmaller(int[] arr,int n){
        Deque<Integer> s=new ArrayDeque<>();
        int[] ans=new int[n];
        s.push(0);
        for(int i=0;i<n;i++){
            while (!s.isEmpty() && arr[s.peek()]>=arr[i])
                s.pop();
            ans[i]=s.isEmpty()?-1:s.peek();
            s.push(i);
        }
        return ans;
    }
    public static int[] nextSmaller(int[] arr,int n){
        Deque<Integer> s=new ArrayDeque<>();
        int[] ans=new int[n];
        s.push(n-1);
        for(int i=n-1;i>=0;i--){
            while (!s.isEmpty() && arr[s.peek()]>=arr[i])
                s.pop();
            ans[i]=s.isEmpty()?n:s.peek();
            s.push(i);
        }
        return ans;
    }
    public static int largestArea(int[] arr,int n){
        int res=0;
        int[] ns=nextSmaller(arr,arr.length);
        int[] ps=previousSmaller(arr,arr.length);
        for(int i=0;i<n;i++){
            int curr=arr[i];
            curr+=(i-ps[i]-1)*arr[i];
            curr+=(ns[i]-i-1)*arr[i];
            res=Math.max(curr,res);
        }

        return res;
    }
    public static int largestArea2(int[] arr,int n){
        Deque<Integer> s=new ArrayDeque<>();
        int res=0;
        int top,curr;
        for(int i=0;i<n;i++){
            while (!s.isEmpty() && arr[s.peek()]>=arr[i]){
                top=s.pop();
                curr=arr[top]*(s.isEmpty()?i:(i-s.peek()-1));
                res=Math.max(res,curr);
            }
            s.push(i);
        }
        while (!s.isEmpty()){
            top=s.pop();
            curr=arr[top]*(s.isEmpty()?n:(n-s.peek()-1));
            res=Math.max(curr,res);
        }
        return res;
    }
    public static void main(String[] args) {
        int[] arr={6,2,5,4,1,5,6};
        System.out.println(largestArea2(arr,arr.length));
    }
}
