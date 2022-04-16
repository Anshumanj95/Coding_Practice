package BinaryTree;
import java.util.ArrayDeque;
import java.util.Deque;

import static BinaryTree.Tree.Node;
public class MaximumWidth {
    public static int maxWidth(Node root){
        if(root==null)
            return 0;
        Deque<Node> q=new ArrayDeque<>();
        q.add(root);
        int res=0;
        while (!q.isEmpty()){
            int count=q.size();
            res=Math.max(count,res);
            for(int i=0;i<count;i++){
                Node curr=q.poll();
                if (curr.left!=null)
                    q.add(curr.left);
                if(curr.right!=null)
                    q.add(curr.right);
            }
        }
        return res;
    }
    public static void main(String[] args) {
        Node root=new Node(10);
        root.left=new Node(20);
        root.right=new Node(30);
        root.left.left=new Node(40);
        root.left.right=new Node(50);
        root.right.left=new Node(60);
        root.right.right=new Node(70);
        System.out.println(maxWidth(root));

    }
}
