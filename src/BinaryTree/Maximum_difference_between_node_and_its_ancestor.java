package BinaryTree;
import static BinaryTree.Tree.Node;
/*As we are given a binary tree, there is no relationship between node values so we need to traverse whole binary tree to get max difference and we can obtain the result in one traversal only by following below steps:
        If we are at leaf node then just return its value because it can’t be ancestor of any node. Then at each internal node we will try to get minimum value from left subtree and right subtree and calculate the difference between node value and this minimum value and according to that we will update the result.
        As we are calculating minimum value while returning in recurrence, we will check all optimal possibilities (checking node value with minimum subtree value only) of differences and hence calculate the result in one traversal only.*/
public class Maximum_difference_between_node_and_its_ancestor {
    static int maxi;
    public static int find(Node root){
        if(root==null)
            return Integer.MAX_VALUE;
        if(root.left==null && root.right==null)
            return root.key;
        int left=find(root.left);
        int right=find(root.right);
        int mini=Math.min(left,right);
        maxi=Math.max(maxi,root.key-mini);
        return Math.min(mini,root.key);
    }
    public static int maxDiff(Node root){
        maxi=Integer.MIN_VALUE;
        int val=find(root);
        return maxi;
    }
    public static void main(String[] args) {

    }
}
