package BinaryTree;

import java.util.ArrayDeque;
import java.util.Queue;
import BinaryTree.Tree.Node;

public class IsBinaryTreeIsHeap {
    public static boolean isHeap(Node root){
        Queue<Node> q=new ArrayDeque<>();
        q.add(root);
        boolean hasnoleft=false,hasnoright=false;
        while (!q.isEmpty()){
            Node p=q.poll();
            if((p.left!=null && p.right!=null) &&(hasnoleft||hasnoright))
                return false;
            boolean hasleft=false;
            if (p.left!=null){
                hasleft=true;
                if (p.left.key<=p.key)
                    q.add(p.left);
                else
                    return false;
            }
            else
                hasnoleft=true;
            if(p.right!=null){
                if (!hasleft)
                    return false;
                if (p.right.key<=p.key)
                    q.add(p.right);
                else
                    return false;
            }
            else
                hasnoright=true;

        }
        return true;
    }
    public static void main(String[] args) {

    }
}
