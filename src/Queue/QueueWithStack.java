package Queue;
import java.util.*;

public class QueueWithStack {
    static Stack<Integer> s1,s2;
     QueueWithStack() {
        s1=new Stack<>();
        s2=new Stack<>();
    }

    public void push(int x) {
        while (!s1.isEmpty())
            s2.push(s1.pop());
        s1.push(x);
        while (!s2.isEmpty())
            s1.push(s2.pop());
    }

    public int pop() {
        if (!s1.isEmpty())
            return s1.pop();
        return -1;
    }

    public int peek() {
        return s1.peek();
    }

    public boolean empty() {
        return s1.isEmpty();
    }
    public static void main(String[] args) {

    }
}
