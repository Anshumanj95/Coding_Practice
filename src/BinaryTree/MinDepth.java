package BinaryTree;

public class MinDepth {
    //maxDepth of tree is height if tree
    public static int mindepth(Tree.Node root){
        if (root==null)
            return 0;
        if (root.left==null && root.right==null)
            return 1;
        if (root.left==null)
            return 1+mindepth(root.right);
        if (root.right==null)
            return 1+mindepth(root.left);
        return 1+Math.min(mindepth(root.left),mindepth(root.right));
    }
    public static void main(String[] args) {

    }
}
