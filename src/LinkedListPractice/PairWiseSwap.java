package LinkedListPractice;
import static LinkedListPractice.MyLinkedList.*;
public class PairWiseSwap {
    public static Node swap(Node head){
        if(head==null || head.next==null)
            return head;
        Node curr=head.next.next;
        Node prev=head;
        head=head.next;
        head.next=prev;
        while (curr!=null && curr.next!=null){
            prev.next=curr.next;
            prev=curr;
            Node next=curr.next.next;
            curr.next.next=curr;
            curr=next;
        }
        prev.next=curr;
        return head;
    }
    public static void main(String[] args) {
        Node head=new Node(11);
        Node l1=new Node(13);
        Node l2=new Node(14);
        Node l3=new Node(18);
        Node l4=new Node(3);
        Node l5=new Node(2);
        head.next=l1;
        l1.next=l2;
        l2.next=l3;
        l3.next=l4;
        l4.next=l5;
        printList(head);
        printList(swap(head));
    }
}
