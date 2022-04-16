package BinarySearchTree;
import java.util.Map;
import java.util.TreeMap;

import static BinarySearchTree.Node_class.Node;
public class VerticalSum_in_aBinaryTree {
    public static void VerticalSum(Node root){
        TreeMap<Integer,Integer> map=new TreeMap<>();
        vsumr(root,0,map);
        for(Map.Entry m:map.entrySet())
            System.out.print(m.getValue()+" ");
    }
    public static void vsumr(Node root,int hd,TreeMap<Integer,Integer> map){
        if(root==null)
            return;
        vsumr(root.left,hd-1,map);
        int pSum=(map.get(hd)==null)?0:map.get(hd);
        map.put(hd,pSum+root.key);
        vsumr(root.right,hd+1,map);
    }
    public static void main(String[] args) {

    }
}
