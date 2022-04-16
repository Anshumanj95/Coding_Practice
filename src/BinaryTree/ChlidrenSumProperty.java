package BinaryTree;
import javax.swing.text.StyledEditorKit;

import static BinaryTree.Tree.Node;
public class ChlidrenSumProperty {
    public static boolean isCSum(Node root){
        if(root==null)
            return true;
        if(root.left==null && root.right==null)
            return true;
        int sum=0;
        if(root.right!=null)
            sum+=root.right.key;
        if(root.left!=null)
            sum+=root.left.key;
        return (root.key==sum && isCSum(root.left) && isCSum(root.right));
    }
    public static void main(String[] args) {
        Node root=new Node(10);
        root.left=new Node(2);
        root.left.left=new Node(1);
        root.left.right=new Node(1);
        root.right=new Node(8);
        root.right.left=new Node(4);
        root.right.right=new Node(4);
    }
}
