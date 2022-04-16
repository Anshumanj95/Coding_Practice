package BinaryTree;
import java.util.ArrayList;
import java.util.HashSet;

import static BinaryTree.Tree.Node;
public class Node_at_distance {
    static HashSet<Node> h=new HashSet<>();
    static void count(Node root, int k, ArrayList<Node> a){
        if(root==null)
            return;
        a.add(root);
        if(root.left==null && root.right==null && a.size()>k){
            h.add(a.get(a.size()-1-k-1));
        }
        count(root.left,k,a);
        count(root.right,k,a);
        a.remove(root);
    }
    public static int printKDistantFromLeaf(Node root, int k)
    {
        // Write your code here
        ArrayList<Node> a=new ArrayList<>();
        count(root,k,a);
        return h.size();
    }
    public static void main(String[] args) {

    }
}
