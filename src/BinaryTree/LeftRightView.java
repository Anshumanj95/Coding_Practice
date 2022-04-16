package BinaryTree;
import java.util.ArrayDeque;
import java.util.Queue;

import static BinaryTree.Tree.Node;
public class LeftRightView {
    public static void printLeftView(Node root){
        if(root==null)
            return;
        Queue<Node> q=new ArrayDeque<>();
        q.add(root);
        while (!q.isEmpty()){
            int count=q.size();
            for(int i=0;i<count;i++){
                Node curr=q.poll();
                if(i==0)
                    System.out.print(curr.key+" ");
                if(curr.left!=null)
                    q.add(curr.left);
                if(curr.right!=null)
                    q.add(curr.right);
            }
        }
    }
    public static void printRightView(Node root){
        if(root==null)
            return;
        Queue<Node> q=new ArrayDeque<>();
        q.add(root);
        while (!q.isEmpty()){
            int count=q.size();
            for(int i=0;i<count;i++){
                Node curr=q.poll();
                if(i==count-1)
                    System.out.print(curr.key+" ");
                if(curr.left!=null)
                    q.add(curr.left);
                if(curr.right!=null)
                    q.add(curr.right);
            }
        }
    }
    public static void main(String[] args) {
        Node root=new Node(10);
        root.left=new Node(20);
        root.right=new Node(30);
        root.left.left=new Node(40);
        root.left.right=new Node(50);
        root.right.right=new Node(70);
        printLeftView(root);
        System.out.println();
        printRightView(root);
    }
}
