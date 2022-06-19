package BinaryTree;
import static BinaryTree.Tree.Node;
public class SymmetricTree {
    //Mirror of itself
    public static boolean isSymmetric(Node root){
        return root==null || isMirror(root.left,root.right);
    }
    public static boolean isMirror(Node left,Node right){
        if (left==null || right==null)
            return left==right;
        if (left.key!=right.key)
            return false;
        return isMirror(left.left,right.right) && isMirror(left.right,right.left);
    }
    public static void main(String[] args) {
        Node root=new Node(1);
        root.left=new Node(2);
        root.left.left=new Node(3);
        root.left.right=new Node(4);
        root.right=new Node(2);
        root.right.left=new Node(4);
        root.right.right=new Node(3);
        System.out.println(isSymmetric(root));
    }
}
