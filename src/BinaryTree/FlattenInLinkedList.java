package BinaryTree;
import static BinaryTree.Tree.Node;
public class FlattenInLinkedList {
    static Node prev=null;
    public static void flatten(Node root){
        if (root==null)
            return;
        flatten(root.right);
        flatten(root.left);
        root.right=prev;
        root.left=null;
        prev=root;
    }
    public static void main(String[] args) {
        Node root=new Node(1);
        root.left=new Node(2);
        root.left.left=new Node(3);
        root.left.right=new Node(4);
        root.right=new Node(5);
        root.right.right=new Node(6);
        flatten(root);

    }
}
