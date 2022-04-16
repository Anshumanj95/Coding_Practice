package BinaryTree;
import static BinaryTree.Tree.Node;
public class Maximum_path_sum_from_any_node {
    static int max;
    public static int getMax(Node root){
        if(root==null)
            return 0;
        int lt=getMax(root.left);
        int rt=getMax(root.right);

        max=Math.max(max,lt+rt+root.key);
        max=Math.max(max,rt+ root.key);
        max=Math.max(max,lt+root.key);
        max=Math.max(max,root.key);
        System.out.println(lt+" "+rt+" "+max);
        return Math.max(Math.max(lt,rt)+root.key,root.key);
    }
    public static int findMax(Node root){
        max=Integer.MIN_VALUE;
        int val=getMax(root);
        return max;
    }
    public static void main(String[] args) {
        Node root=new Node(10);
        root.left=new Node(20);
        root.left.left=new Node(2);
        root.left.right=new Node(1);
        root.right=new Node(-25);
        root.right.right=new Node(3);
        System.out.println(findMax(root));
    }
}
