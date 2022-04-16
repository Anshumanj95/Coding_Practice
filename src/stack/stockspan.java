package stack;
import java.util.*;
public class stockspan {
    public static void span(int[] arr){
        Deque<Integer> s=new ArrayDeque<>();
        s.push(0);
        int span=1;
        System.out.print(span+" ");
        for(int i=1;i<arr.length;i++){
            while (!s.isEmpty() && arr[s.peek()]<=arr[i])
                s.pop();
            span=s.isEmpty()?i+1:i-s.peek();
            System.out.print(span+" ");
            s.push(i);
        }

    }
    public static void main(String[] args) {
        int[] arr={100, 80, 60, 70, 60, 75, 85};
        span(arr);
    }
}
