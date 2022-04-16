package LinkedListPractice;
import static LinkedListPractice.MyLinkedList.*;
public class evenOddList {
    public static Node segregateEvenOdd(Node head){
        Node es=null,ee=null,os=null,oe=null;
        for(Node curr=head;curr!=null;curr=curr.next){
            int x= curr.data;
            if(x%2==0){
                if(es==null){
                    es=curr;
                    ee=es;
                }
                else{
                    ee.next=curr;
                    ee=ee.next;
                }
            }
            else{
                if(os==null){
                    os=curr;
                    oe=os;
                }
                else{
                    oe.next=curr;
                    oe=oe.next;
                }
            }
        }
        if(os==null || es==null)
            return head;
        ee.next=os;
        oe.next=null;
        return es;
    }
    public static Node oddEvenListByIndex(Node head){
        if (head==null)
            return null;
        Node odd=head,even=head.next,evenHead=even;
        while (even!=null && even.next!=null){
            odd.next=even.next;
            odd=odd.next;
            even.next=odd.next;
            even=even.next;
        }
        odd.next=evenHead;
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
        //printList(segregateEvenOdd(head));
        printList(oddEvenListByIndex(head));

    }
}
