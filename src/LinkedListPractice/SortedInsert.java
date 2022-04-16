package LinkedListPractice;
import LinkedListPractice.MyLinkedList.*;

import static LinkedListPractice.MyLinkedList.*;

public class SortedInsert {
    public static Node insert(Node head,int x){
        Node temp=new Node(x);
        if(head==null){
            return temp;
        }
        if(x< head.data){
            temp.next=head;
            return temp;
        }
        Node curr=head;
        while(curr.next!=null && curr.next.data<x) {
            curr=curr.next;
        }
        temp.next=curr.next;
        curr.next=temp;
        return head;
    }

    public static void main(String[] args) {
        Node head=new Node(10);
        head.next=new Node(20);
        head.next.next=new Node(30);
        printList(insert(head,25));

    }
}
