package LinkedListPractice;
import static LinkedListPractice.MyLinkedList.*;
public class segregate_0s_1s_and_2s {
    public static Node sort(Node head){
       Node zeroDummy=new Node(-1);
       Node zeroTail=zeroDummy;
       Node oneDummy=new Node(-1);
       Node oneTail=oneDummy;
       Node twoDummy=new Node(-1);
       Node twoTail=twoDummy;
       Node curr=head;
       while (curr!=null){
           if (curr.data==0){
               zeroTail=zeroTail.next=new Node(0);
           }
           else if (curr.data==1){
               oneTail=oneTail.next=new Node(1);
           }
           else if (curr.data==2){
               twoTail=twoTail.next=new Node(2);
           }
           curr=curr.next;
       }
       if (oneDummy.next!=null) {
           zeroTail.next = oneDummy.next;
       }
       else {
           zeroTail.next = twoDummy.next;
       }
       oneTail.next=twoDummy.next;
       twoTail.next=null;
       return zeroDummy.next;

    }
    public static void main(String[] args) {
        Node head=new Node(0);
        head.next=new Node(2);
        head.next.next=new Node(2);
        head.next.next.next=new Node(2);
        head.next.next.next.next=new Node(0);
        head.next.next.next.next.next=new Node(2);
        printList(head);
        printList(sort(head));
    }
}
