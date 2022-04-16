package stack;

import java.util.Stack;

public class GetMinimum {
    //use for both positive and negative elements
    //for only positive elements see changes
    static Stack<Integer> s=new Stack<>();
    static int min;
    public static void push(int x){
        if(s.isEmpty()){
            s.push(x);
            min=x;
        }
        else if(x<=min){
            s.push(2*x-min);//x-min
            min=x;
        }
        else
            s.push(x);
    }
    public static int getMin(){
        return min;
    }
    public static int peek(){
        int t=s.peek();
        return (t<=min)?min:t;//t<=0
    }
    public static int pop(){
        int t=s.pop();
        if(t<=min){//t<=0
            int res=min;
            min=2*min-t;//min=min-t;
            return res;
        }
        else
            return t;
    }
    public static void main(String[] args) {
        push(5);
        push(10);
        push(20);
        System.out.println(getMin());
        push(2);
        System.out.println(getMin());
        push(6);
        System.out.println(peek());
    }
}
