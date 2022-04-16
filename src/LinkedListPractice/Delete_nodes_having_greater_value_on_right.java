package LinkedListPractice;
import static LinkedListPractice.MyLinkedList.*;
public class Delete_nodes_having_greater_value_on_right {
    public static Node deleteNode(Node head){
        head=reverseList.reverse(head);
        Node curr=head;
        Node currNext=head.next;
        while (currNext!=null){
            if(curr.data> currNext.data){
                curr.next=currNext.next;
                currNext=curr.next;
            }
            else{
                curr=currNext;
                currNext=currNext.next;
            }
        }
        return reverseList.reverse(head);
    }
    public static void main(String[] args) {
        Node head=new Node(12);
        head.next=new Node(15);
        head.next.next=new Node(10);
        head.next.next.next=new Node(11);
        head.next.next.next.next=new Node(5);
        head.next.next.next.next.next=new Node(6);
        head.next.next.next.next.next.next=new Node(2);
        head.next.next.next.next.next.next.next=new Node(3);
        printList(head);
        printList(deleteNode(head));

    }
}
