package BinaryTree;
import static BinaryTree.Tree.Node;
public class Maximum {
    public static int getMax(Node root){
        if(root==null)
            return Integer.MIN_VALUE;
        return Math.max(root.key, Math.max(getMax(root.left),getMax(root.right)));
    }
    public static void main(String[] args) {
        Node root=new Node(10);
        root.left=new Node(20);
        root.right=new Node(30);
        root.left.left=new Node(40);
        root.left.right=new Node(50);
        root.right.right=new Node(70);
        System.out.println(getMax(root));
    }
}
