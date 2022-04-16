package BinaryTree;
import java.util.ArrayList;
import java.util.Objects;
import java.util.Stack;

import static BinaryTree.Tree.Node;
public class IterativeTraversal {
    public static ArrayList<Integer> Inorder(Node root){
        ArrayList<Integer> ans=new ArrayList<>();
        if(root==null)
            return ans;
        Stack<Node> s=new Stack<>();
        Node curr=root;
        while(curr!=null || !s.isEmpty()){
            while (curr!=null){
                s.push(curr);
                curr=curr.left;
            }
            curr=s.pop();
            ans.add(curr.key);
            curr=curr.right;
        }
        return ans;
    }
    public static ArrayList<Integer> postOrder(Node root){
        ArrayList<Integer> ans=new ArrayList<>();
        if (root==null)
            return ans;
        Stack<Node> s=new Stack<>();
        Node curr=root;
        while (curr!=null || !s.isEmpty()){
            while (curr!=null) {
                if (curr.left != null) {
                    s.push(curr.left);
                }
                ans.add(curr.key);
                curr = curr.right;
            }
            if (!s.isEmpty())
                curr=s.pop();
        }
        return ans;
    }
    public static ArrayList<Integer> preOrder(Node root){
        ArrayList<Integer> ans=new ArrayList<>();
        if(root==null)
            return ans;
        Stack<Node> s=new Stack<>();
        Node curr=root;
        while(curr!=null || !s.isEmpty()){
            while (curr!=null){
                ans.add(curr.key);
                if(curr.right!=null)
                    s.push(curr.right);
                curr=curr.left;
            }
            if(!s.isEmpty())
                curr=s.pop();
        }

        return ans;
    }

    public static void main(String[] args) {
        Node root=new Node(10);
        root.left=new Node(20);
        root.left.left=new Node(30);
        root.left.right=new Node(40);
        root.right=new Node(60);
        System.out.println(Inorder(root));
        System.out.println(preOrder(root));
        System.out.println(postOrder(root));
    }
}
