package BinaryTree;
import static BinaryTree.Tree.Node;
public class NumberOfTurn {
    static int ans;
    public static int countTurn(Node root,int first,int second){
        ans=0;
        Node lca=findLca(root,first,second);
        boolean left=true;
        if (lca.key==first){
            findTurn(lca.left,left,second);
            findTurn(lca.right,!left,second);
        }
        else if(lca.key==second){
            findTurn(lca.left,left,first);
            findTurn(lca.right,!left,first);
        }
        else{
            findTurn(lca.left,left,first);
            findTurn(lca.right,!left,first);
            findTurn(lca.left,left,second);
            findTurn(lca.right,!left,second);
            return ans+1;
        }
        return ans;
    }
    public static Node findLca(Node root,int first,int second){
        if (root==null)
            return null;
        if (root.key==first||root.key==second)
            return root;
        Node left=findLca(root.left,first,second);
        Node right=findLca(root.right,first,second);
        if (left!=null && right!=null)
            return root;
        else
            return left==null?right:left;
    }
    public static boolean findTurn(Node root,boolean left,int x){
        if (root==null)
            return false;
        if(root.key==x)
            return true;
        if(left){
            if(findTurn(root.left,left,x)){
                return true;
            }
            if(findTurn(root.right,!left,x)){
                ans++;
                return true;
            }
        }else{
            if(findTurn(root.right,left,x)){
                return true;
            }
            if(findTurn(root.left,!left,x)){
                ans++;
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {

    }
}
