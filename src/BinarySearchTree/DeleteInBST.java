package BinarySearchTree;
import static BinarySearchTree.Node_class.Node;
public class DeleteInBST {
    //get next greater closet element
    public static Node getSuccessor(Node root){
        Node curr=root.right;
        while (curr!=null && curr.left!=null)
            curr=curr.left;
        return curr;
    }
    public static Node delete(Node root,int x){
        if(root==null)
            return null;
        if(root.key>x)
            root.left=delete(root.left,x);
        else if(root.key<x)
            root.right=delete(root.right,x);
        else{
            if(root.left==null)
                return root.right;
            if (root.right==null)
                return root.left;
            else {
                Node succ=getSuccessor(root);
                root.key= succ.key;
                root.right=delete(root.right,succ.key);
            }
        }
        return root;
    }
    public static void main(String[] args) {

    }
}
