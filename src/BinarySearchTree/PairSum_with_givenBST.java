package BinarySearchTree;
import BinaryTree.Tree;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Stack;

import static BinarySearchTree.Node_class.Node;
public class PairSum_with_givenBST {
    public static ArrayList<Integer> inorder(Node root){
        ArrayList<Integer> ans=new ArrayList<>();
        if(root==null)
            return ans;
        Stack<Node> s=new Stack<>();
        Node curr=root;
        while(curr!=null || !s.isEmpty()){
            while (curr!=null){
                s.push(curr);
                curr=curr.left;
            }
            curr=s.pop();
            ans.add(curr.key);
            curr=curr.right;
        }
        return ans;
    }
    public static boolean check(ArrayList<Integer> arr,int sum){
        int i=0;
        int j=arr.size()-1;
        while (i<j){
            if(arr.get(i)+arr.get(j)==sum)
                return true;
            if (arr.get(i)+arr.get(j)>sum)
                j--;
            else
                i++;
        }
        return false;
    }
    public static boolean isPairSum(Node root,int sum){
        ArrayList<Integer> inorder=inorder(root);
        return check(inorder,sum);
    }
    // this solution is use hashing,and it is use for binary tree as well because it does not work for sorted lis or sorted traversal
    // it has  worst case time O(n) if it finds in pair in between is return true
    public static boolean ispairSum(Node root, int sum, HashSet<Integer> s){
        if(root==null)
            return false;
        if(ispairSum(root.left,sum,s))
            return true;
        if(s.contains(sum-root.key))
            return true;
        else
            s.add(root.key);
        return ispairSum(root.right,sum,s);

    }
    public static void main(String[] args) {
        Node root=new Node(10);
        root.left=new Node(8);
        root.left.left=new Node(4);
        root.left.right=new Node(9);
        root.right=new Node(20);
        root.right.left=new Node(11);
        root.right.right=new Node(30);
        root.right.right.left=new Node(25);
        System.out.println(isPairSum(root,10));
    }
}
