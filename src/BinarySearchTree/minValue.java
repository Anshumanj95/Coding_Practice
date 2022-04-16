package BinarySearchTree;
import static BinarySearchTree.Node_class.Node;
public class minValue {
    public static int min(Node root){
        if(root==null)
            return -1;
        while (root.left!=null)
            root=root.left;
        return root.key;
    }
    public static void main(String[] args) {
        Node root=new Node(9);
        root.right=new Node(10);
        root.right.right=new Node(11);
        System.out.println(min(root));
    }
}
