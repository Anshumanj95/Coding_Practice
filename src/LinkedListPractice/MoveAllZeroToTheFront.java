package LinkedListPractice;
import static LinkedListPractice.MyLinkedList.*;
public class MoveAllZeroToTheFront {
    public static Node moveAllZero(Node head){
        if (head==null || head.next==null)
            return head;
        Node newhead=head;
        Node curr=head;
        Node prev=null;
        while (curr!=null && curr.data==0){
            prev=curr;
            curr=curr.next;
        }
        if (curr==null)
            return head;
        while (curr!=null){
            Node next=curr.next;
            if (curr.data==0){
                prev.next=next;
                curr.next=newhead;
                newhead=curr;
                curr=next;
            }
            else{
                prev=curr;
                curr=curr.next;
            }
        }
        return newhead;

    }
    public static void main(String[] args) {
        Node head=new Node(0);
        head.next=new Node(4);
        head.next.next=new Node(0);
        head.next.next.next=new Node(5);
        head.next.next.next.next=new Node(0);
        printList(head);
        printList(moveAllZero(head));
    }
}
