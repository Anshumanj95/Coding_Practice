package BinaryTree;
import static BinaryTree.Tree.Node;
public class GoodNodes {
    public static int goodNode(Node root){
        return good(root,-10000);
    }
    public static int good(Node root,int max){
        if (root==null)
            return 0;
        int res=root.key>=max?1:0;
        res+=good(root.left,Math.max(root.key,max));
        res+=good(root.right,Math.max(root.key,max));
        return res;
    }
    public static void main(String[] args) {
        Node root=new Node(3);
        root.left=new Node(1);
        root.left.left=new Node(3);
        root.right=new Node(4);
        root.right.left=new Node(1);
        root.right.right=new Node(5);
        System.out.println(goodNode(root));
    }
}
