package BinarySearchTree;
import java.util.PropertyResourceBundle;

import static BinarySearchTree.Node_class.Node;
public class FloorAndCeilInBST {
    //greater from all smaller value and equal value than x
    public static Node floor(Node root,int x){
        Node res=null;
        while (root!=null){
            if(root.key==x)
                return root;
            else if(root.key>x)
                root=root.left;
            else{
                res=root;
                root=root.right;
            }
        }
        return res;
    }
    //smaller from all greater value and equal value than x
    public static Node ceil(Node root,int x){
        Node res=null;
        while (root!=null){
            if(root.key==x)
                return root;
            else if(root.key<x)
                root=root.right;
            else{
                res=root;
                root=root.left;
            }
        }
        return res;
    }
    public static void main(String[] args) {
        Node root=new Node(10);
        root.left=new Node(5);
        root.left.right=new Node(6);
        root.right=new Node(15);
        root.right.left=new Node(12);
        root.right.right=new Node(17);
        System.out.println(floor(root,13).key);
        System.out.println(ceil(root,13).key);
    }
}
