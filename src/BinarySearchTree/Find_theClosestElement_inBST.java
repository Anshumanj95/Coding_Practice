package BinarySearchTree;
import static BinarySearchTree.Node_class.Node;
public class Find_theClosestElement_inBST {
    public static int minDiff(Node root,int k){
        if(root==null)
            return 0;
        int diff=Integer.MAX_VALUE;
        while (root!=null){
            if(root.key>k){
                int curr=Math.abs(root.key-k);
                diff=Math.min(diff,curr);
                root= root.left;
            }
            else{
                int curr=Math.abs(root.key-k);
                diff=Math.min(diff,curr);
                root=root.right;
            }
        }
        return diff;
    }
    public static void main(String[] args) {
        Node root=new Node(10);
        root.left=new Node(2);
        root.left.left=new Node(1);
        root.left.right=new Node(5);
        root.left.right.left=new Node(3);
        root.left.right.left.right=new Node(4);
        root.left.right.right=new Node(6);
        root.right=new Node(11);
        System.out.println(minDiff(root,13));
    }
}
