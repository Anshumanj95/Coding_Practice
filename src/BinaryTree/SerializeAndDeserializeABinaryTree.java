package BinaryTree;
import java.util.ArrayList;

import static BinaryTree.Tree.Node;
public class SerializeAndDeserializeABinaryTree {
    public static ArrayList<Integer> serialize(Node root, ArrayList<Integer> arr){
        if(root==null){
            arr.add(-1);
            return arr;
        }
        arr.add(root.key);
        arr=serialize(root.left,arr);
        arr=serialize(root.right,arr);
        return arr;
    }
    public static Node deserialize(ArrayList<Integer> arr){
        int curr=arr.remove(0);
        if (curr==-1)
            return null;
        Node root=new Node(curr);
        root.left=deserialize(arr);
        root.right=deserialize(arr);
        return root;

    }
    public static void main(String[] args) {
        Node root=new Node(10);
        root.left=new Node(34);
        root.right=new Node(12);
        root.left.left=new Node(45);
        root.left.right=new Node(23);
        System.out.println(serialize(root,new ArrayList<>()));

    }
}
