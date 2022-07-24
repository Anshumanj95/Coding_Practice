package BinaryTree;
import static BinaryTree.Tree.Node;
public class MaxPathSumRootToLeaf {
    public static int maxPathSum(Node root){
        if (root==null)
            return 0;
        return root.key+Math.max(maxPathSum(root.left),maxPathSum(root.right));
    }
    public static void main(String[] args) {
        Node root=new Node(10);
        root.left=new Node(-2);
        root.right=new Node(7);
        root.left.left=new Node(8);
        root.left.right=new Node(-4);
        System.out.println(maxPathSum(root));

    }
}
