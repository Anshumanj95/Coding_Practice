package stack;
import java.util.*;
public class greater {
    // if you print the output without using extra array output is displayed in reverse order note this point
    public static int[] nextGreaterElement(int[] arr){
        Deque<Integer> s=new ArrayDeque<>();
        int[] res=new int[arr.length];
        s.push(arr[arr.length-1]);
        res[arr.length-1]=-1;
        for(int i=arr.length-2;i>=0;i--){
            while (!s.isEmpty() && s.peek()<=arr[i])
                s.pop();
            res[i]=s.isEmpty()?-1:s.peek();
            s.push(arr[i]);
        }
        return res;
    }
    public static void main(String[] args) {
        int[] arr={5,15,10,8,6,12,9,18};
        int[] ans=nextGreaterElement(arr);
        for(int s:ans)
            System.out.print(s+" ");

    }
}
