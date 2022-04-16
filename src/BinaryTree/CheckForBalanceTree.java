package BinaryTree;
import static BinaryTree.Tree.Node;
public class CheckForBalanceTree {
    public static int isBalanced(Node root){
        if(root==null)
            return 0;
        int lh=isBalanced(root.left);
        if(lh==-1)
            return -1;
        int rh=isBalanced(root.right);
        if(rh==-1)
            return -1;
        if(Math.abs(lh-rh)>1)
            return -1;
        else
             return Math.max(lh,rh)+1;
    }
    public static void main(String[] args) {
        Node root=new Node(10);
        root.left=new Node(2);
        root.left.left=new Node(1);
        root.left.right=new Node(1);
        root.right=new Node(8);
        root.right.left=new Node(4);
        root.right.right=new Node(4);
        System.out.println(isBalanced(root));

    }
}
