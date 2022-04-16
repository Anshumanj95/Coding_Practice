package BinaryTree;
import java.util.ArrayList;

import static BinaryTree.Tree.Node;
public class LowestCommonAncestor {
    public static boolean findPath(Node root, ArrayList<Node> p,int n){
        if(root==null)
            return false;
        p.add(root);
        if(root.key==n)
            return true;
        if(findPath(root.left,p,n)||findPath(root.right,p,n))
            return true;
        p.remove(p.size()-1);
        return false;
    }
    public static Node lca(Node root,int n1,int n2){
        ArrayList<Node> path1=new ArrayList<>();
        ArrayList<Node> path2=new ArrayList<>();
        if(!findPath(root,path1,n2)||!findPath(root,path2,n2))
            return null;
        for(int i=0;i< path1.size()-1&&i< path2.size()-1;i++){
            if(path1.get(i+1)!=path2.get(i+1))
                return path1.get(i);
        }
        return null;
    }
    // it is only traverse tree only once but with assumption that both n1 and n2 are present in the tree
    public static Node method2lca(Node root,int n1,int n2){
        if(root==null)
            return null;
        if(root.key==n1||root.key==n2)
            return root;
        Node lca1=method2lca(root.left,n1,n2);
        Node lca2=method2lca(root.right,n1,n2);
        //if one is present in left side and other present in right side
        if(lca1!=null && lca2!=null)
            return root;
        // if both present on left side
        if(lca1!=null)
            return lca1;
        // if both present on right side
        else
            return lca2;
    }
    public static void main(String[] args) {

    }
}
