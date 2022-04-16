package LinkedListPractice;
import static LinkedListPractice.MyLinkedList.*;
public class AddTwoNumber {
    public static Node AddTWoList(Node head1,Node head2){
        Node head=null;
        Node added=null;
        int sum=0,carry=0;
        head1=reverse(head1);
        head2=reverse(head2);
        while (head1!=null || head2!=null){
            int fd=(head1==null)?0:head1.data;
            int sd=(head2==null)?0:head2.data;
            sum=fd+sd+carry;
            carry=sum/10;
            if(head==null)
                added=head=new Node(sum%10);
            else
                added=added.next=new Node(sum%10);
            if(head1!=null)
                head1=head1.next;
            if(head2!=null)
                head2=head2.next;
        }
        if(carry==1)
            added.next=new Node(carry);
        return reverse(head);

    }
    public static Node reverse(Node head){
        Node prev=null;
        Node curr=head;
        while(curr!=null){
            Node next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        return prev;
    }
    public static void main(String[] args) {
        Node head1=new Node(2);
        head1.next=new Node(4);
        Node head2=new Node(1);
        head2.next=new Node(5);
        head2.next.next=new Node(2);
        printList(head1);
        printList(head2);
        printList(AddTWoList(head1,head2));

    }
}
