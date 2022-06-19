package BinaryTree;
import java.util.HashSet;
import java.util.Set;

import static BinaryTree.Tree.Node;
public class VerticalWidthOfABinaryTree {
    static int verticalWidth(Node root) {

        return traverse(root, 0, new HashSet<>()).size();
    }
    static Set<Integer> traverse(Node root, int line, Set<Integer> set) {
        if (root == null) return set;
        set.add(line);
        traverse(root.left, line - 1, set);
        traverse(root.right, line + 1, set);
        return set;
    }
    public static void main(String[] args) {
        Node root=new Node(10);
        root.left=new Node(12);
        root.left.left=new Node(11);
        root.left.right=new Node(2);
        root.right=new Node(3);
        root.right.left=new Node(4);
        root.right.right=new Node(5);
        root.right.left.right=new Node(6);
        root.right.right.right=new Node(90);
        System.out.println(verticalWidth(root));
    }
}
