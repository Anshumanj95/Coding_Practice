package BinarySearchTree;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Stack;

import static BinarySearchTree.Node_class.Node;
public class FindCommonNodes_in_two_BSTs {
    public static ArrayList<Integer> findCommon(Node root1,Node root2)
    {
        //code here
        ArrayList<Integer> ans=new ArrayList<>();
        HashSet<Integer> hs=new HashSet<>();
        inorder(root1,hs);
        inordersearch(root2,hs,ans);
        return ans;
    }
    public static void inordersearch(Node root,HashSet<Integer> hs,ArrayList<Integer> al){
        if(root==null)
            return;
        inordersearch(root.left,hs,al);
        if(hs.contains(root.key))
            al.add(root.key);
        inordersearch(root.right,hs,al);
    }
    public static void inorder(Node root,HashSet<Integer> hs){
        if(root==null)
            return;
        inorder(root.left,hs);
        hs.add(root.key);
        inorder(root.right,hs);
    }
    public static void main(String[] args) {

    }
}
