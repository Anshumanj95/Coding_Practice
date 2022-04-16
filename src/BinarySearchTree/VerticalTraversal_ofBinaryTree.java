package BinarySearchTree;
import java.util.*;

import static BinarySearchTree.Node_class.Node;
public class VerticalTraversal_ofBinaryTree {
    static class pair{
        Node node;
        int hd;
        pair(Node n,int h){
            node=n;
            hd=h;
        }
    }
    public static void VerticalOrder(Node root){
        Queue<pair> q=new ArrayDeque<>();
        Map<Integer, ArrayList<Integer>> map=new TreeMap<>();
        q.add(new pair(root,0));
        while (!q.isEmpty()){
            pair p=q.poll();
            Node curr=p.node;
            int hd=p.hd;
            if(map.containsKey(hd))
                map.get(hd).add(curr.key);
            else{
                ArrayList<Integer> al=new ArrayList<>();
                al.add(curr.key);
                map.put(hd,al);
            }
            if(curr.left!=null)
                q.add(new pair(curr.left,hd-1));
            if(curr.right!=null)
                q.add(new pair(curr.right,hd+1));

            }
        for(Map.Entry<Integer,ArrayList<Integer>> m:map.entrySet()){
            ArrayList<Integer> al=m.getValue();
            for(int x:al)
                System.out.print(x+" ");
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(20);
        root.right = new Node(30);
        root.left.left = new Node(40);
        root.left.right = new Node(50);
        VerticalOrder(root);
    }
}
