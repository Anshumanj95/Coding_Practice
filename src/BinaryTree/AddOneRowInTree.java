package BinaryTree;
import java.util.LinkedList;
import java.util.Queue;

import static BinaryTree.Tree.Node;

public class AddOneRowInTree {
    public static Node AddOneAtDepth(Node root,int val,int depth){
        if (depth==1){
            Node curr=new Node(val);
            curr.left=root;
            return curr;
        }
        int d=2;
        Queue<Node> q=new LinkedList<>();
        q.add(root);
        while (d<depth){
            int size=q.size();
            d++;
            for (int i=0;i<size;i++){
                Node curr=q.poll();
                if (curr.left!=null)
                    q.add(curr.left);
                if (curr.right!=null)
                    q.add(curr.right);
            }
        }
        for (Node curr:q){
            Node left=curr.left;
            Node right=curr.right;
            Node newLeft=new Node(val);
            curr.left=newLeft;
            newLeft.left=left;
            Node newRight=new Node(val);
            curr.right=newRight;
            newRight.right=right;
        }
        return root;
    }
    public static void main(String[] args) {
        Node root=new Node(4);
        root.left=new Node(2);
        root.right=new Node(3);
        root.left.left=new Node(5);
        root.left.right=new Node(6);
        root=AddOneAtDepth(root,1,2);
        traversal.preOrder(root);

    }
}
