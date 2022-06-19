package LinkedListPractice;
import static LinkedListPractice.MyLinkedList.Node;
import static LinkedListPractice.MyLinkedList.printList;

public class ReverseSublist {
    public static Node reverseBtw(Node head,int m,int n){
        Node first=head;
        Node prev=null;
        Node end=head;
        Node afterEnd=null;
        while (--m>0){
            prev=first;
            first=first.next;
        }
        while (--n>0)
            end=end.next;
        if (end!=null)
            afterEnd=end.next;
        Node curr=first;
        Node next=first;
        Node p=null;
        while (p!=end){
            next=curr.next;
            curr.next=p;
            p=curr;
            curr=next;
        }
        if (prev!=null)
            prev.next=end;
        else head=end;
        if (afterEnd!=null)
            first.next=afterEnd;
        return head;
    }
    public static Node reverseBtw2(Node head,int m,int n){
        Node temp=new Node(0);
        temp.next=head;
        Node prev=temp;
        int i=1;
        while (i<m){
            prev=prev.next;
            i++;
        }
        Node start=prev.next;
        while (m<n){
            Node temp1=start.next;
            start.next=temp1.next;
            temp1.next=prev.next;
            prev.next=temp1;
            m++;
        }
        return temp.next;
    }
    public static void main(String[] args) {
        Node head=new Node(1);
        head.next=new Node(2);
        head.next.next=new Node(3);
        head.next.next.next=new Node(4);
        head.next.next.next.next=new Node(5);
        head.next.next.next.next.next=new Node(6);
        printList(head);
        reverseBtw2(head,2,4);
        printList(head);
    }
}
