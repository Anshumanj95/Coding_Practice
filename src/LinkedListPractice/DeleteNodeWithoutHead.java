package LinkedListPractice;
import static LinkedListPractice.MyLinkedList.*;
public class DeleteNodeWithoutHead {
    public static void delete(Node del){
        del.data=del.next.data;
        del.next=del.next.next;
    }
    public static void main(String[] args) {
        Node head=new Node(30);
        Node l1=new Node(23);
        Node l2=new Node(25);
        Node l3=new Node(12);
        Node l4=new Node(44);
        head.next=l1;
        l1.next=l2;
        l2.next=l3;
        l3.next=l4;
        printList(head);
        delete(l2);
        printList(head);
    }
}
