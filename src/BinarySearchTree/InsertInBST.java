package BinarySearchTree;
import static BinarySearchTree.Node_class.Node;
public class InsertInBST {
    public static Node insert(Node root,int x){
        //recursion
//        if(root==null)
//            return new Node(x);
//        if(root.key>x)
//            root.left=insert(root.left,x);
//        else if(root.key<x)
//            root.right=insert(root.right,x);
//        return root;
        //iterative
        Node temp=new Node(x);
        Node parent=null,curr=root;
        while (curr!=null){
            parent=curr;
            if(curr.key>x)
                curr=curr.left;
            else if(curr.key<x)
                curr=curr.right;
            else
                return root;
        }
        if(parent==null)
            return temp;
        if(parent.key>x)
            parent.left=temp;
        else
            parent.right=temp;
        return root;
    }
    public static void main(String[] args) {
        Node root=new Node(30);
        root.left=new Node(12);
        root.left.left=new Node(11);
        root.right=new Node(35);
        root.right.right=new Node(40);

    }
}
