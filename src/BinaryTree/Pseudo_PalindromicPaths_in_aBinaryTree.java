package BinaryTree;
import static BinaryTree.Tree.Node;

public class Pseudo_PalindromicPaths_in_aBinaryTree {
    static int count;
    public static int count(Node root){
        preorder(root,0);
        return count;
    }
    public static void preorder(Node root,int path){
        if (root!=null){
            path=path^(1<< root.key);
            System.out.println(path);
            if (root.left==null && root.right==null){
                if ((path &(path-1))==0)
                    count++;
            }
            preorder(root.left,path);
            preorder(root.right,path);
        }
    }
    public static void main(String[] args) {
        Node root=new Node(2);
        root.left=new Node(1);
        root.right=new Node(1);
        root.left.left=new Node(1);
        root.left.right=new Node(3);
        root.left.right.right=new Node(1);
        System.out.println(count(root));
    }
}

