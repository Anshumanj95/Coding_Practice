package stack;
import java.util.*;

public class SortStack {
    public static Stack<Integer> sort(Stack<Integer> s){
        Stack<Integer> st=new Stack<>();
        while(!s.isEmpty()){
            int temp=s.pop();
            while(!st.isEmpty()&&st.peek()<temp){
                s.push(st.pop());
            }
            st.push(temp);
        }
        return st;
    }
    public static void main(String[] args) {
        Stack<Integer> s=new Stack<>();
        s.push(34);
        s.push(32);
        s.push(2);
        s.push(66);
        s.push(12);
        Stack<Integer> ans=sort(s);
        while(!ans.isEmpty()){
            System.out.print(ans.pop()+" ");
        }
        System.out.println();
    }
}
