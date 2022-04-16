package BinaryTree;
import static BinaryTree.Tree.Node;
public class ConstructBinaryTreeFromInorderAndPostorder {
    static int index;
    public static Node construct(int[] in,int[] po,int is,int ie){
        if(is>ie)
            return null;

        Node root=new Node(po[index--]);

        int inIndex=0;
        for (int i=is;i<=ie;i++){
            if(in[i]==root.key){
                inIndex=i;
                break;
            }
        }
        if(is==ie)
            return root;
        root.right=construct(in,po,inIndex+1,ie);
        root.left=construct(in,po,is,inIndex-1);

        return root;
    }
    public static void main(String[] args) {
        int[] in={20,10,40,30,50};
        int[] po={20,40,50,30,10};
        index=po.length-1;
        Node root=construct(in,po,0,po.length-1);
        traversal.Inorder(root);

    }
}
