package LinkedListPractice;
import static LinkedListPractice.MyLinkedList.*;
public class MiddelELement {
    public static void MiddleElement(Node head){
        if(head==null)
            return;
        Node slow=head;
        Node fast=head;
        while (fast!=null && fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
        }
        System.out.println(slow.data);
    }
    public static void main(String[] args) {
        Node head=new Node(10);
        head.next=new Node(20);
        head.next.next=new Node(30);
        head.next.next.next=new Node(90);
        head.next.next.next.next=new Node(100);
        printList(head);
        MiddleElement(head);
    }
}
