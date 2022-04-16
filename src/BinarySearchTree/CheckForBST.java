package BinarySearchTree;
import static BinarySearchTree.Node_class.Node;
public class CheckForBST {
    public static boolean isBST(Node root,int min,int max){
        if(root==null)
            return true;
        return (root.key>min && root.key<max && isBST(root.left,min,root.key) && isBST(root.right,root.key,max));
    }

    //Note:if inorder traversal of a tree is in increasing order than it is a bst
    // a simple way to store inorder traversal of tree in an array and check if array is sorted increasingly or not
    // but,it requires O(n) space
    //solution which take O(1) space
    static int prev=Integer.MIN_VALUE;
    public static boolean isBst(Node root){
        if(root==null)
            return true;
        if(!isBst(root.left))
            return false;
        if(root.key<=prev)
            return false;
        prev=root.key;
        return isBst(root.right);
    }
    public static void main(String[] args) {
        Node root=new Node(20);
        root.left=new Node(8);
        root.right=new Node(30);
        root.right.left=new Node(18);
        root.right.right=new Node(35);
        System.out.println(isBST(root,Integer.MIN_VALUE,Integer.MAX_VALUE));
        System.out.println(isBst(root));
    }
}
