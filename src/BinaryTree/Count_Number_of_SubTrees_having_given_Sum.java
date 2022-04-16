package BinaryTree;
import static BinaryTree.Tree.Node;
public class Count_Number_of_SubTrees_having_given_Sum {
    static int count;
    public static int CountSubTreeWithX(Node root,int x){
        count=0;
        findSubtree(root,x);
        return count;
    }
    public static int findSubtree(Node root,int x){
        if(root==null)
            return 0;
        int l=findSubtree(root.left,x);
        int r=findSubtree(root.right,x);
        if((root.key+l+r)==x)
            count++;
        return root.key+l+r;
    }
    public static void main(String[] args) {
        Node root=new Node(5);
        root.left=new Node(-10);
        root.left.left=new Node(9);
        root.left.right=new Node(8);
        root.right=new Node(3);
        root.right.left=new Node(-4);
        root.right.right=new Node(7);
        System.out.println(CountSubTreeWithX(root,7));
    }
}
