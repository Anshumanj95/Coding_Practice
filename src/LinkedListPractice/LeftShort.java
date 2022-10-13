package LinkedListPractice;
import static LinkedListPractice.MyLinkedList.Node;
import static LinkedListPractice.MyLinkedList.printList;

public class LeftShort {
    // Modify the linked list by removing the nodes from the list that have a greater valued
    // node on their adjacent left in the given linked list.
    public static Node modify(Node head){
        if (head==null)
            return null;
        Node curr=head;
        int left=curr.data;
        while (curr.next!=null){
            if (left>curr.next.data){
                left=curr.next.data;
                curr.next=curr.next.next;
            }
            else{
                left=curr.next.data;
                curr=curr.next;
            }
        }
        return head;
    }
    public static void main(String[] args) {
        Node head=new Node(80);
        head.next=new Node(70);
        head.next.next=new Node(60);
        head.next.next.next=new Node(65);
        head.next.next.next.next=new Node(70);
        head.next.next.next.next.next=new Node(66);
        head.next.next.next.next.next.next=new Node(75);
        head.next.next.next.next.next.next.next=new Node(72);
        printList(modify(head));
    }
}
