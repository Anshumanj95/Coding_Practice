package BinaryTree;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

import static BinaryTree.Tree.Node;
public class TraversalInSpiralFrom {
    public static void traversal1(Node root){
        if(root==null)
            return;
        Stack<Node> s1=new Stack<>();
        Stack<Node> s2=new Stack<>();
        s1.push(root);
        while (!s1.isEmpty()||!s2.isEmpty()){
            while (!s1.isEmpty()){
                Node curr=s1.pop();
                System.out.print(curr.key+" ");
                if(curr.left!=null)
                    s2.push(curr.left);
                if(curr.right!=null)
                    s2.push(curr.right);
            }
            while (!s2.isEmpty()){
                Node curr=s2.pop();
                System.out.print(curr.key+" ");
                if(curr.right!=null)
                    s1.push(curr.right);
                if(curr.left!=null)
                    s1.push(curr.left);
            }
        }
    }
    public static void traversal2(Node root){
        if(root==null)
            return;
        Queue<Node> q=new ArrayDeque<>();
        Stack<Integer> s=new Stack<>();
        boolean reverse=false;
        q.add(root);
        while (!q.isEmpty()){
            int count=q.size();
            for(int i=0;i<count;i++){
                Node curr=q.poll();
                if(reverse)
                    s.add(curr.key);
                else
                    System.out.print(curr.key+" ");
                if(curr.left!=null)
                    q.add(curr.left);
                if(curr.right!=null)
                    q.add(curr.right);
            }
            if(reverse){
                while (!s.isEmpty()){
                    System.out.print(s.pop()+" ");
                }
            }
            reverse=!reverse;
        }
    }
    public static void main(String[] args) {
        Node root=new Node(1);
        root.left=new Node(2);
        root.right=new Node(3);
        root.left.left=new Node(4);
        root.left.right=new Node(5);
        root.right.left=new Node(6);
        root.right.right=new Node(7);
        traversal1(root);
    }
}
