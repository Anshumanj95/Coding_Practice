package BinaryTree;
import java.util.ArrayList;
import java.util.HashSet;

import static BinaryTree.Tree.Node;
public class CheckIfSubTreeAndIndentical {
    public static boolean isSubtree(Node T, Node S) {
        // add code here.
        if(T==null && S==null)
            return true;
        if(T==null || S==null)
            return false;
        return isSame(T,S)|| isSubtree(T.left,S)||isSubtree(T.right,S);
    }
    public static boolean isSame(Node T, Node S) {
        // add code here.
        if(T==null && S==null)
            return true;
        if(T==null || S==null)
            return false;
        return T.key==S.key && isSame(T.left,S.left) && isSame(T.right,S.right);

    }

    public static void main(String[] args) {
        Node root1=new Node(1);
        root1.left=new Node(2);
        root1.right=new Node(3);
        root1.right.left=new Node(4);
        Node root2=new Node(4);
        root2.left=new Node(3);
        System.out.println(isSubtree(root1,root2));
    }
}
