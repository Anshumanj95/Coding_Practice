package BinaryTree;
import java.util.LinkedList;
import java.util.List;

import static BinaryTree.Tree.Node;
public class PathSum {
    //is there a path from root to leaf node have value equal to sum
    public static boolean pathSum_I(Node root,int sum){
        if (root==null)
            return false;
        if (root.left==null && root.right==null && sum-root.key==0)
            return true;
        return pathSum_I(root.left,sum-root.key)||pathSum_I(root.right,sum-root.key);
    }
    // return all the root to leaf path
    public static List<List<Integer>> pathSum_II(Node root,int sum){
        List<List<Integer>> ans=new LinkedList<>();
        List<Integer> curr=new LinkedList<>();
        find(root,sum,curr,ans);
        return ans;
    }
    public static void find(Node root,int sum,List<Integer> curr,List<List<Integer>> ans){
        if (root==null)
            return;
        curr.add(root.key);
        if (root.left==null && root.right==null && sum-root.key==0){
            ans.add(new LinkedList<>(curr));
            curr.remove(curr.size()-1);     // backtracking step
            return;
        }
        else{
            find(root.left,sum-root.key,curr,ans);
            find(root.right,sum-root.key,curr,ans);
        }
        curr.remove(curr.size()-1); //Backtracking step
    }
    // return the no of path having value equal to given sum The path does not need to start or end at the root or a leaf, but it must go downwards
    // (i.e., traveling only from parent nodes to child nodes).
    public static int pathSum_III(Node root,int sum){
        if (root==null)
            return 0;
        return pathSum_III(root.left,sum)+pathSum_III(root.right,sum)+pathIncludeRoot(root,0,sum);
    }
    public static int pathIncludeRoot(Node root,int res,int sum){
        if (root==null)
            return 0;
        if (sum==root.key)
            res++;
        res+=pathIncludeRoot(root.left,0,sum- root.key)+pathIncludeRoot(root.right,0,sum-root.key);
        return res;
    }


    public static void main(String[] args) {
        Node root=new Node(5);
        root.left=new Node(4);
        root.right=new Node(8);
        root.left.left=new Node(11);
        root.left.left.left=new Node(7);
        root.left.left.right=new Node(2);
        root.right.left=new Node(13);
        root.right.right=new Node(4);
        root.right.right.left=new Node(5);
        root.right.right.right=new Node(1);
        System.out.println(pathSum_I(root,22));
        System.out.println(pathSum_II(root,22));
        System.out.println(pathSum_III(root,8));
    }
}
