package BinaryTree;
import static BinaryTree.Tree.Node;
public class ConstructBinaryTreeFromInorderAndPreorder {
    public static int preOrder=0;
    public static Node construct(int[] inorder,int[] pre,int is,int ie){
        if(is>ie)
            return null;
        Node root=new Node(pre[preOrder++]);
        int inIndex=0;
        for (int i=is;i<=ie;i++){
            if(inorder[i]==root.key){
                inIndex=i;
                break;
            }
        }
        root.left=construct(inorder,pre,is,inIndex-1);
        root.right=construct(inorder,pre,inIndex+1,ie);
        return root;
    }
    public static void main(String[] args) {
        int[] in={20,10,40,30,50};
        int[] pr={10,20,30,40,50};
        Node root=construct(in,pr,0,pr.length-1);
        traversal.Inorder(root);

    }
}
