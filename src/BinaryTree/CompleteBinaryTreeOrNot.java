package BinaryTree;
import java.util.ArrayDeque;
import java.util.Queue;

import static BinaryTree.Tree.Node;
public class CompleteBinaryTreeOrNot {
    public static int totalNode(Node root){
        Queue<Node> q=new ArrayDeque<>();
        q.add(root);
        int count=0;
        while (!q.isEmpty()){
            Node curr=q.poll();
            count++;
            if (curr.left!=null)
                q.add(curr.left);
            if (curr.right!=null)
                q.add(curr.right);
        }
        return count;
    }
    public static boolean isComplete(Node root){
        if (root==null)
            return true;
        Queue<Node> q=new ArrayDeque<>();
        q.add(root);
        int total=totalNode(root);
        int count=1;
        while (!q.isEmpty()){
            Node curr=q.poll();
            if (curr.left!=null && curr.right!=null){
                q.add(curr.left);
                q.add(curr.right);
                count+=2;
            }
            else if (curr.left==null && curr.right!=null)
                return false;
            else if(curr.left!=null){
                q.add(curr.left);
                count++;
                break;
            }
        }
        return count==total;
    }
    public static void main(String[] args) {

    }
}
