package BinarySearchTree;
import static BinarySearchTree.Node_class.Node;
public class FixBSTwithTwoNodesSwapped {
    static Node prev=null,first=null,second=null;
    public static void findSwapped(Node root){
        if(root==null)
            return;
        findSwapped(root.left);
        if(prev!=null &&root.key<prev.key){
            if(first==null)
                first=prev;
            second=root;
        }
        prev=root;
        findSwapped(root.right);
    }
    public static Node finBst(Node root){
        int temp=first.key;
        first.key=second.key;
        second.key=temp;
        return root;
    }
    public static void main(String[] args) {

    }
}
