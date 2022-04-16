package BinarySearchTree;
import java.util.*;

import static BinarySearchTree.Node_class.Node;
public class TopViewOfBST {
    static class pair{
        Node node;
        int hd;
        pair(Node n,int h){
            node=n;
            hd=h;
        }
    }
    //simply to vertical traversal and print only top level element in vertical lines
    //same as vertical traversal but with few minor change in this we add only first element of hd and then ignore other value
    public static void TopView(Node root){
        Queue<pair> q=new ArrayDeque<>();
        Map<Integer, Integer> map=new TreeMap<>();
        q.add(new pair(root,0));
        while (!q.isEmpty()){
            pair p=q.poll();
            Node curr=p.node;
            int hd=p.hd;
            if(!map.containsKey(hd)){
                map.put(hd, curr.key);
            }
            if(curr.left!=null)
                q.add(new pair(curr.left,hd-1));
            if(curr.right!=null)
                q.add(new pair(curr.right,hd+1));

        }
        for(Map.Entry m:map.entrySet()){
            System.out.print(m.getValue()+" ");
        }
    }
    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(20);
        root.right = new Node(30);
        root.left.left = new Node(40);
        root.left.right = new Node(50);
        TopView(root);
    }
}
