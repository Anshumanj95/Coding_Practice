package LinkedListPractice;
import java.util.ArrayDeque;
import java.util.Deque;

import static LinkedListPractice.MyLinkedList.*;
public class Reorder {
    public static void reorderList(Node head) {
        if(head == null || head.next == null){
            return;
        }
        Node mid=middle(head);
        Node hs=reverse(mid);
        Node hf=head;
        while (hs!=null && hf!=null){
            Node temp=hf.next;
            hf.next=hs;
            hf=temp;
            temp=hs.next;
            hs.next=hf;
            hs=temp;
        }
        if (hf!=null)
            hf.next=null;

    }
    public static Node reverse(Node head){
        Node curr=head;
        Node prev=null;
        while (curr!=null){
            Node next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        return prev;
    }
    public static Node middle(Node head){
        Node slow =head;
        Node fast=head;
        while (fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }

    public static void main(String[] args) {
        Node head=new Node(1);
        head.next=new Node(2);
        head.next.next=new Node(3);
        head.next.next.next=new Node(4);
        reorderList(head);
        printList(head);
    }
}
