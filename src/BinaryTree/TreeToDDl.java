package BinaryTree;
import static BinaryTree.Tree.Node;
public class TreeToDDl {
    static Node prev=null;
    public static Node convertBTToDDL(Node root){
        if(root==null)
            return root;
        Node head=convertBTToDDL(root.left);
        if(prev==null){
            head=root;
        }
        else{
            root.left=prev;
            prev.right=head;
        }
        prev=root;
        convertBTToDDL(root.right);
        return head;
    }
    public static Node convertBToCDLL(Node root){
        Node head=convertBTToDDL(root);
        Node curr=head;
        while (curr.right!=null)
            curr=curr.right;
        curr.right=head;
        head.left=curr;
        return head;
    }
    public static void main(String[] args) {

    }
}
