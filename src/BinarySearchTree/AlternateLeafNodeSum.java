package BinarySearchTree;
import java.util.ArrayList;

import static BinarySearchTree.Node_class.Node;
public class AlternateLeafNodeSum {
    public static void leafNode(Node root, ArrayList<Integer> ans){
        if(root==null)
            return;
        if(root.left==null && root.right==null){
            ans.add(root.key);
            return;
        }
        if(root.left!=null)
            leafNode(root.left,ans);
        if(root.right!=null)
            leafNode(root.right,ans);
    }

    public static Node insert(Node root,int x) {
        if(root==null)
            return new Node(x);
        if(root.key>x)
            root.left=insert(root.left,x);
        else if(root.key<x)
            root.right=insert(root.right,x);
        return root;
    }
    public static void main(String[] args) {
        int[] arr={5,1,2,3,4,8,9,7};
        Node root=null;
        for(int i=0;i<arr.length;i++){
            root=insert(root,arr[i]);
        }
        ArrayList<Integer> ans=new ArrayList<>();
        leafNode(root,ans);
        long sum=0;
        for(int i=0;i<ans.size();i+=2){
            sum+=ans.get(i);
        }
        System.out.println(sum);


    }
}
