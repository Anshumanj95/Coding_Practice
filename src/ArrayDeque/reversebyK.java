package ArrayDeque;
import java.util.*;
public class reversebyK {
    public static void left_Rotate_Deq_ByK(ArrayDeque<Integer> deque, int n, int k)
    {
        for(int i=0;i<k;i++){
            deque.offerLast(deque.pollFirst());
        }
    }

    public static void right_Rotate_Deq_ByK(ArrayDeque<Integer> deque, int n, int k)
    {
        for(int i=0;i<k;i++){
            deque.offerFirst(deque.pollLast());
        }
    }
    public static void main(String[] args) {
        ArrayDeque<Integer> deque=new ArrayDeque<>();
        deque.offerLast(1);
        deque.offerLast(2);
        deque.offerLast(3);
        deque.offerLast(4);
        deque.offerLast(5);
        deque.offerLast(6);
        Scanner sc=new Scanner(System.in);
        int k=sc.nextInt();
        left_Rotate_Deq_ByK(deque,deque.size(),k);
        for(int e:deque)
            System.out.print(e+" ");

    }
}
