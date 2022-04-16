package BinaryTree;
import java.util.Stack;

class Node1{
    char data;
    Node1 left;
    Node1 right;
    Node1(char data){
        this.data=data;
        left=right=null;
    }
}
public class ConstructExpressionTree {
    public static Node1 construct(String postfix){
        Stack<Node1> st=new Stack<>();
        Node1 temp,t1,t2;
        for (int i=0;i<postfix.length();i++){
            if (!isOperator(postfix.charAt(i))){
                temp=new Node1(postfix.charAt(i));
                st.push(temp);
            }
            else{
                temp=new Node1(postfix.charAt(i));
                t1=st.pop();
                t2=st.pop();
                temp.left=t2;
                temp.right=t1;
                st.push(temp);
            }
        }
        temp=st.pop();
        return temp;
    }
    public static boolean isOperator(char ch){
        return ch == '+' || ch == '/' || ch == '-' || ch == '*' || ch == '^';
    }
    public static void inorder(Node1 root){
        if(root!=null){
            inorder(root.left);
            System.out.print(root.data+" ");
            inorder(root.right);
        }
    }
    public static void main(String[] args) {
        String postfix="wlrb+-*";
        Node1 r=construct(postfix);
        inorder(r);
    }
}
