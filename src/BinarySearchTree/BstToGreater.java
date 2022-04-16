package BinarySearchTree;
import static BinarySearchTree.Node_class.*;
public class BstToGreater {
    static int sum=0;
    public static Node convertBst(Node root){
        if (root==null)
            return null;
        convertBst(root.right);
        sum+=root.key;
        root.key=sum;
        convertBst(root.left);
        return root;
    }
    public static void main(String[] args) {
    }
}
