package BinarySearchTree;
import static BinarySearchTree.Node_class.*;
public class TrimBST {
    public static Node trimBst(Node root,int low,int high){
        if (root==null)
            return null;
        if (root.key<low)
            return trimBst(root.right,low,high);
        if (root.key>high)
            return trimBst(root.left,low,high);
        root.left=trimBst(root.left,low,high);
        root.right=trimBst(root.right,low,high);
        return root;
    }
    public static void main(String[] args) {

    }
}
