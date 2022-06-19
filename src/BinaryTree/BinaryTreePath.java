package BinaryTree;
import java.util.ArrayList;
import java.util.List;

import static BinaryTree.Tree.Node;
public class BinaryTreePath {
    public static List<String > allPath(Node root){
        List<String> ans=new ArrayList<>();
        StringBuilder sb=new StringBuilder();
        helper(root,sb,ans);
        return ans;
    }
    public static void helper(Node root,StringBuilder sb,List<String> ans){
        if (root==null)
            return;
        int len=sb.length();
        sb.append(root.key);
        if (root.left==null && root.right==null)
            ans.add(sb.toString());
        else{
            sb.append("->");
            helper(root.left,sb,ans);
            helper(root.right,sb,ans);
        }
        sb.setLength(len);
    }
    public static void main(String[] args) {
        Node root=new Node(1);
        root.left=new Node(2);
        root.right=new Node(3);
        root.left.right=new Node(5);
        System.out.println(allPath(root));
    }
}
