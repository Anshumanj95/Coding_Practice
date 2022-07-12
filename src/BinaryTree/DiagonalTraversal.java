package BinaryTree;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Queue;

import static BinaryTree.Tree.Node;
public class DiagonalTraversal {
    public static ArrayList<Integer> diagonal(Node root){
        ArrayList<Integer> ans=new ArrayList<>();
        Queue<Node> q=new ArrayDeque<>();
        q.add(root);
        while (!q.isEmpty()){
            Node curr=q.poll();
            while (curr!=null){
                if (curr.left!=null)
                    q.add(curr);
                ans.add(curr.key);
                curr=curr.right;
            }
        }
        
        return ans;
    }
    public static void main(String[] args) {

    }
}
