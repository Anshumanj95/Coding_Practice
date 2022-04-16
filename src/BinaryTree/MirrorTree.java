package BinaryTree;
import static BinaryTree.Tree.Node;
public class MirrorTree {
    // simply call mirror function for left subtree or right subtree then swap the reference of left child and right child
    public static void mirror(Node root){
        if(root==null)
            return;
        mirror(root.left);
        mirror(root.right);
        Node temp=root.left;
        root.left=root.right;
        root.right=temp;
    }
    public static void main(String[] args) {

    }
}
