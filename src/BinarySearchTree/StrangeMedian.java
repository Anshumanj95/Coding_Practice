package BinarySearchTree;
import java.util.ArrayList;
import java.util.SortedSet;
import java.util.TreeSet;

import static BinarySearchTree.Node_class.Node;
public class StrangeMedian {
    static ArrayList<Node> nodesList;
    static void traverseInorder(Node node) {
        if(node==null)return;
        traverseInorder(node.left);
        nodesList.add(node);
        traverseInorder(node.right);
        return;
    }

    static int median(Node root, int k) {
        if(root==null)return -1;
        // Code here
        nodesList = new ArrayList<>();
        traverseInorder(root);
        Node subTree = nodesList.get(k-1);
        nodesList = new ArrayList<>();
        traverseInorder(subTree);
        int len=nodesList.size();
        if(len%2!=0){
            return nodesList.get(len/2).key;
        } else {
            return (nodesList.get(len/2).key+nodesList.get((len/2)-1).key)/2;
        }
    }
    public static void main(String[] args) {
        Node root=new Node(50);
        root.left=new Node(25);
        root.left.left=new Node(15);
        root.left.right=new Node(45);
        root.left.left.left=new Node(11);
        root.left.left.right=new Node(20);
        root.left.right.left=new Node(30);
        root.left.right.right=new Node(49);
        root.right=new Node(75);
        root.right.right=new Node(90);
        root.right.right.left=new Node(80);
        System.out.println(median(root,9));
    }
}
