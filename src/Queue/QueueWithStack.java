package Queue;
import java.util.*;

public class QueueWithStack {
    static Stack<Integer> s1,s2;
    int front;
     QueueWithStack() {
        s1=new Stack<>();
        s2=new Stack<>();
    }

    public void push(int x) {
        if(s1.isEmpty())
            front=x;
        s1.push(x);
    }

    public int pop() {
        if(s2.isEmpty()){
            while(!s1.isEmpty())
                s2.push(s1.pop());
        }
        return s2.pop();
    }

    public int peek() {
        if(!s2.isEmpty())
            return s2.peek();
        return front;
    }

    public boolean empty() {
        return s1.isEmpty()&& s2.isEmpty();
    }
    public static void main(String[] args) {

    }
}
