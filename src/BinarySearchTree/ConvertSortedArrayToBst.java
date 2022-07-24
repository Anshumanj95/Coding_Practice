package BinarySearchTree;
import static BinarySearchTree.Node_class.Node;
public class ConvertSortedArrayToBst {
    public static Node convert(int[] arr){
        if (arr==null)
            return null;
        return Bst(arr,0,arr.length-1);
    }
    public static Node Bst(int[] arr,int low,int high){
        if (low>high)
            return null;
        int mid=(low+high)/2;
        Node root=new Node(arr[mid]);
        root.left=Bst(arr,low,mid-1);
        root.right=Bst(arr,mid+1,high);
        return root;
    }

    public static void main(String[] args) {

    }
}
