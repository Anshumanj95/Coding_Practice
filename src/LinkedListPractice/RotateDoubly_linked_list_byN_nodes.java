package LinkedListPractice;
import static LinkedListPractice.DoublyLinkedList.*;
public class RotateDoubly_linked_list_byN_nodes {
    /*
    1. To rotate the Doubly linked list, first, we need to traverse through the linked list and find the address of the last node.

    2. Then make it a circular linked list.

    3. Then move the head as well as a temp by n nodes.

    4. Then make the linked list as un-circular.
     */
    static Node head;
    public static void rotate(int n){
        if(n==0)
            return;
        Node curr=head;
        int count=1;
        while (count<n&& curr!=null){
            curr=curr.next;
            count++;
        }
        if (curr==null)
            return;
        Node nthNode=curr;

        while (curr.next!=null)
            curr= curr.next;
        curr.next=head;
        head=nthNode.next;
        head.prev=null;
        nthNode.next=null;

    }
    public static void main(String[] args) {
        head=new Node(1);
        head.next=new Node(2);
        head.next.next=new Node(3);
        head.next.prev=head.next;
        head.next.next.next=new Node(4);
        head.next.next.prev=head.next.next;
        head.next.next.next.next=new Node(5);
        head.next.next.next.prev=head.next.next.next;
        head.next.next.next.next.next=new Node(6);
        head.next.next.next.next.prev=head.next.next.next.next;
        printList(head);
        rotate(2);
        printList(head);

    }
}
