package BinarySearchTree;
import static BinarySearchTree.Node_class.Node;
public class PreOrderToPostOrder {
    public static Node construct(int[] pre){
        int index=0;
        Node root=new Node(pre[index++]);
        while (index<pre.length){
            Node curr=root;
            Node prev=null;
            while (curr!=null){
                prev=curr;
                if(pre[index]< curr.key)
                    curr=curr.left;
                else
                    curr=curr.right;
            }
            if(pre[index]< prev.key)
                prev.left=new Node(pre[index]);
            else
                prev.right=new Node(pre[index]);
            index++;
        }
        return root;
    }
    public static void main(String[] args) {

    }
}
