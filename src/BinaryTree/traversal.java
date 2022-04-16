package  BinaryTree;
import static BinaryTree.Tree.Node;
//dft depth first traversal
public class traversal {
    public static void Inorder(Node root){
        if(root!=null){
            Inorder(root.left);
            System.out.print(root.key+" ");
            Inorder(root.right);
        }
    }
    public static void preOrder(Node root){
        if(root!=null){
            System.out.print(root.key+" ");
            preOrder(root.left);
            preOrder(root.right);
        }
    }
    public static void postOrder(Node root){
        if(root!=null){
            postOrder(root.left);
            postOrder(root.right);
            System.out.print(root.key+" ");
        }
    }
    public static int height(Node root){
        if(root==null)
            return 0;
        return Math.max(height(root.right),height(root.left))+1;
    }
    public static void main(String[] args) {
        Node root=new Node(10);
        root.left=new Node(20);
        root.right=new Node(30);
        root.right.left=new Node(40);
        root.right.right=new Node(50);
        Inorder(root);
        System.out.println();
        preOrder(root);
        System.out.println();
        postOrder(root);
        System.out.println();
        System.out.println(height(root));
    }
}
