package LinkedListPractice;
import static LinkedListPractice.DoublyLinkedList.*;
public class ReverseDoublyLinkedListInGrp {
    public static Node reverseInGrp(Node head, int k){
        if (head == null)
            return null;

        head.prev = null;
        Node temp;
        Node curr = head;
        Node newHead = null;
        int count = 0;

        while (curr != null && count < k) {
            newHead = curr;
            temp = curr.prev;
            curr.prev = curr.next;
            curr.next = temp;
            curr = curr.prev;
            count++;
        }

        if (count >= k) {
            Node rest = reverseInGrp(curr, k);
            head.next = rest;
            if (rest != null)
                rest.prev = head;
        }
        return newHead;

    }
    public static void main(String[] args) {
        Node head=new Node(20);
        Node l1=new Node(30);
        Node l2=new Node(10);
        Node l3=new Node(40);
        Node l4=new Node(5);
        Node l5=new Node(3);
        head.next=l1;
        l1.next=l2;
        l2.next=l3;
        l3.next=l4;
        l4.next=l5;
        l1.prev=head;
        l2.prev=l1;
        l3.prev=l2;
        l4.prev=l3;
        l5.prev=l4;
        printList(head);
        Node newHead=reverseInGrp(head,3);
        printList(newHead);

    }
}
