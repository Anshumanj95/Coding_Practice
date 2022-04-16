package BinaryTree;
import static BinaryTree.Tree.Node;
public class countNodeInCompleteBinaryTree {
    public static int CountNodes(Node root){
        int lh=0;
        int rh=0;
        Node curr=root;
        while (curr!=null){
            lh++;
            curr= curr.left;
        }
        curr=root;
        while (curr!=null){
            rh++;
            curr=curr.right;
        }
        if(lh==rh)
            return (int) (Math.pow(2,lh)-1);
        return 1+CountNodes(root.left)+CountNodes(root.right);
    }
    public static void main(String[] args) {

    }
}
