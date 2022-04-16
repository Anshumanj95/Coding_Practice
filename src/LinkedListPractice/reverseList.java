package LinkedListPractice;
import static LinkedListPractice.MyLinkedList.*;
public class reverseList {
    public static Node reverse(Node head){
        Node curr=head;
        Node prev=null;
        while (curr!=null){
            Node  next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        return prev;
    }
    public static Node reverseRec(Node head){
        if(head==null || head.next==null)
            return head;
        Node rest_head=reverseRec(head.next);
        Node rest_tail=head.next;
        rest_tail.next=head;
        head.next=null;
        return rest_head;
    }
    public static Node reverseInGrp(Node head,int k){
        Node curr=head;
        Node prev=null;
        Node next=null;
        int count=0;
        while(curr!=null && count<k){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
            count++;
        }
        if(next!=null){
            head.next= reverseInGrp(next,k);
        }
        return prev;
    }
    public static Node reverseInBtw(Node head,int left,int right){
        if (head==null)
            return null;
        Node curr=head;
        Node prev=null;
        while (left-->1){
            prev=curr;
            curr=curr.next;
            right--;
        }
        Node pointBeforeLeft=prev;
        Node tail=curr;
        while (right-->0){
            Node next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        if (pointBeforeLeft!=null)
            pointBeforeLeft.next=prev;
        else
            head=prev;
        tail.next=curr;
        return head;

    }
    public static void main(String[] args) {
        Node head=new Node(10);
        head.next=new Node(20);
        head.next.next=new Node(30);
        head.next.next.next=new Node(90);
        head.next.next.next.next=new Node(100);
        printList(head);
        printList(reverseInBtw(head,2,4));
    }
}
