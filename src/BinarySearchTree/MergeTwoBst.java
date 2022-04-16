package BinarySearchTree;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

import static BinarySearchTree.Node_class.Node;
public class MergeTwoBst {
    public static List<Integer> merge(Node root1,Node root2){
        ArrayList<Integer> ans=new ArrayList<>();
        Stack<Node> s1=new Stack<>();
        Stack<Node> s2=new Stack<>();
        for (Node curr=root1;curr!=null;curr=curr.left)
            s1.push(curr);
        for (Node curr=root2;curr!=null;curr=curr.left)
            s2.push(curr);
        while (!s1.isEmpty() && !s2.isEmpty()){
            Node val1=s1.peek();
            Node val2=s2.peek();
            if(val1.key<val2.key){
                ans.add(val1.key);
                for (Node curr=s1.pop().right;curr!=null;curr=curr.left)
                    s1.push(curr);
            }
            else{
                ans.add(val2.key);
                for (Node curr=s2.pop().right;curr!=null;curr=curr.left)
                    s2.push(curr);
            }
        }
        while (!s1.isEmpty()){
            Node val= s1.peek();
            ans.add(val.key);
            for (Node curr=s1.pop().right;curr!=null;curr=curr.left)
                s1.push(curr);
        }
        while (!s2.isEmpty()){
            Node val= s2.peek();
            ans.add(val.key);
            for (Node curr=s2.pop().right;curr!=null;curr=curr.left)
                s2.push(curr);
        }
        return ans;
    }
    public static void main(String[] args) {
        Node root1=new Node(5);
        root1.left=new Node(3);
        root1.left.left=new Node(2);
        root1.left.right=new Node(4);
        root1.right=new Node(6);
        Node root2=new Node(2);
        root2.left=new Node(1);
        root2.right=new Node(3);
        root2.right.right=new Node(7);
        root2.right.right.left=new Node(6);
        System.out.println(merge(root1,root2));

    }
}
