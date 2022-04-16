package stack;
import java.lang.reflect.Array;
import java.util.*;
public class previousElement {
    public static void previousGreaterElement(int[] arr){
       Deque<Integer> s=new ArrayDeque<>();
       s.push(arr[0]);
       System.out.print(-1+" ");
       for (int i=1;i<arr.length;i++){
           while (!s.isEmpty() && s.peek()<=arr[i])
               s.pop();
           int pg=s.isEmpty()?-1:s.peek();
           System.out.print(pg+" ");
           s.push(arr[i]);
       }

    }
    public static void main(String[] args) {
        Integer[] arr={1024,512,256,128,64,32,16,8,4,2,1};
        //previousGreaterElement(arr);
        Arrays.sort(arr,(a,b)->Integer.bitCount(b)-Integer.bitCount(a));
        System.out.println(Arrays.toString(arr));
    }
}
