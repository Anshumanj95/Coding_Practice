package BinarySearchTree;
import static BinarySearchTree.Node_class.Node;
public class ConvertLevelOrderTraversal_toBST {
    public static Node constructBst(int[] arr){
        Node root=null;
        for (int i=0;i<arr.length;i++){
            root=insert(root,arr[i]);
        }
        return root;
    }
    public static Node insert(Node root,int data){
        if(root==null)
            return new Node(data);
        if(root.key>=data)
            root.left=insert(root.left,data);
        else
            root.right=insert(root.right,data);
        return root;
    }
    public static void main(String[] args) {

    }
}
