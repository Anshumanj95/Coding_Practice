package BinaryTree;
import static BinaryTree.Tree.Node;
public class printKdist {
    public static void print(Node root,int k){
        if(root==null)
            return;
        if(k==0)
            System.out.print(root.key+" ");
        else{
            print(root.left,k-1);
            print(root.right,k-1);
        }
    }
    public static void main(String[] args) {
        Node root=new Node(10);
        root.left=new Node(20);
        root.right=new Node(30);
        root.left.left=new Node(40);
        root.left.right=new Node(50);
        root.right.right=new Node(70);
        print(root,2);
    }
}
