package BinaryTree;
import java.util.*;

import static BinaryTree.Tree.Node;
public class levelOrderTraversal {
    public static void traversal(Node root){
        if(root==null)
            return;
        Queue<Node> q=new ArrayDeque<>();
        q.add(root);
        while (!q.isEmpty()){
            Node curr=q.poll();
            System.out.print(curr.key+" ");
            if(curr.left!=null)
                q.add(curr.left);
            if(curr.right!=null)
                q.add(curr.right);
        }
    }
    public static void reverseTraversal(Node root){
        if(root==null)
            return;
        Queue<Node> q=new ArrayDeque<>();
        Stack<Node> s=new Stack<>();
        q.add(root);
        while (!q.isEmpty()) {
            Node curr = q.poll();
            s.push(curr);
            if (curr.right != null)
                q.add(curr.right);
            if (curr.left != null)
                q.add(curr.left);

        }
        while (!s.isEmpty()){
            Node node=s.pop();
            System.out.print(node.key+" ");

        }
    }
    public static void traversalLineByLine(Node root){
        if(root==null)
            return;
        Queue<Node> q=new ArrayDeque<>();
        q.add(root);
        while(!q.isEmpty()){
            int count=q.size();
            for(int i=0;i<count;i++){
                Node curr=q.poll();
                System.out.print(curr.key+" ");
                if(curr.left!=null)
                    q.add(curr.left);
                if(curr.right!=null)
                    q.add(curr.right);
            }
            System.out.println();
        }
    }
    //Given a binary tree, find the largest value in each level.
    public static ArrayList<Integer> largestValues(Node root)
    {
        //code here
        Queue<Node> q=new ArrayDeque<>();
        ArrayList<Integer> ans=new ArrayList<>();
        q.add(root);
        while(!q.isEmpty()){
            PriorityQueue<Integer> currl=new PriorityQueue<>(Collections.reverseOrder());
            int count=q.size();
            for(int i=0;i<count;i++){
                Node curr=q.poll();
                currl.add(curr.key);
                if(curr.left!=null)
                    q.add(curr.left);
                if(curr.right!=null)
                    q.add(curr.right);
            }
            ans.add(currl.poll());
            currl.clear();
        }
        return ans;
    }
    public static void main(String[] args) {
        Node root=new Node(10);
        root.left=new Node(20);
        root.right=new Node(30);
        root.left.left=new Node(40);
        root.left.right=new Node(50);
        root.right.left=new Node(60);
        root.right.right=new Node(70);
        traversal(root);
        System.out.println();
        traversalLineByLine(root);
        reverseTraversal(root);
        System.out.println(largestValues(root));
    }
}
