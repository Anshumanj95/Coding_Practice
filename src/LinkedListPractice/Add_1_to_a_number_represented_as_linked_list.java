package LinkedListPractice;
import static LinkedListPractice.MyLinkedList.*;
public class Add_1_to_a_number_represented_as_linked_list {
    public static Node add1(Node head){
        head=reverse(head);
        Node curr=head;
        while (true){
            curr.data+=1;
            if (curr.data<10)
                return reverse(head);
            else
                curr.data=0;
            if (curr.next==null)
                break;
            else
                curr=curr.next;
        }
        curr.next=new Node(1);
        return reverse(head);
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
    public static void main(String[] args) {
        Node head=new Node(9);
        head.next=new Node(9);
        head.next.next=new Node(8);
        head=add1(head);
        printList(head);

    }
}
