package BinaryTree;

import java.util.ArrayDeque;
import java.util.Deque;

class Tree2{
int data;
    Tree2 left;
    Tree2 right;
    Tree2(int d){
        data=d;
        left=null;
        right=null;
    }
}

class Node {
    int data;
    Node next;
    Node(int d) {
        data = d;
        next = null;
    }
}
public class MakeBinaryTreeFromLinkedList {
    public static Tree2 convert(Node head,Tree2 node){
        Deque<Tree2> q=new ArrayDeque<>();
        Node curr=null;
        if(head!=null){
            curr=head;
            node=new Tree2(curr.data);
            q.offer(node);
        }
        while (!q.isEmpty()){
            Tree2 n=q.poll();
            if(curr.next!=null){
                n.left=new Tree2(curr.next.data);
                q.offer(n.left);
                curr=curr.next;
            }
            if(curr.next!=null){
                n.right=new Tree2(curr.next.data);
                q.offer(n.right);
                curr=curr.next;
            }
        }
        return node;
    }
    public static void main(String[] args) {

    }
}
