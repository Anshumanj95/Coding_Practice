package BinarySearchTree;
import static BinarySearchTree.Node_class.Node;
public class SearchInBST {
    public static boolean search(Node root,int x){
        //recursion
//        if(root==null)
//            return false;
//        if(root.key==x)
//            return true;
//        if(root.key>x)
//            return search(root.left,x);
//        else
//            return search(root.right,x);
        //iterative
        while(root!=null){
            if(root.key==x)
                return true;
            if(root.key>x)
                root=root.left;
            else
                root=root.right;
        }
        return false;
    }
    public static void main(String[] args) {
        Node root=new Node(30);
        root.left=new Node(12);
        root.left.left=new Node(11);
        root.right=new Node(35);
        root.right.right=new Node(40);
        System.out.println(search(root,1));

    }
}
