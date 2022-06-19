package BinaryTree;
import static BinaryTree.Tree.Node;
public class SumRootToLeafNumber {
    public static int sumNumber(Node root){
        return sum(root,0);
    }
    public static int sum(Node root,int curr){
        if (root==null)
            return 0;
        curr=curr*10+root.key;
        if (root.left==null && root.right==null)
            return curr;
        int leftSum=sum(root.left,curr);
        int rightSum=sum(root.right,curr);
        return leftSum+rightSum;
    }
    public static void main(String[] args) {
        Node root=new Node(1);
        root.left=new Node(2);
        root.right=new Node(3);
        root.left.right=new Node(5);
        System.out.println(sumNumber(root));
    }
}
