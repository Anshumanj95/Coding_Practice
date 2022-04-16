package LinkedListPractice;
import static LinkedListPractice.MyLinkedList.Node;
import static LinkedListPractice.MyLinkedList.printList;

public class InsertionSort {
    public static Node sort(Node head){
        Node dummy=new Node(10000);
        while (head!=null){
            Node next=head.next;
            Node temp=dummy;
            while (temp.next!=null && temp.next.data<head.data)
                temp=temp.next;
            head.next=temp.next;
            temp.next=head;
            head=next;
        }
        return dummy.next;
    }
    public static Node sort2(Node head){
        Node i=head;
        while(i!=null){
            Node j=i.next;
            while(j!=null){
                if(j.data<i.data){
                    int temp=i.data;
                    i.data=j.data;
                    j.data=temp;
                }
                j=j.next;
            }
            i=i.next;
        }
        return head;
    }
    public static void main(String[] args) {
        Node head=new Node(30);
        head.next=new Node(23);
        head.next.next=new Node(28);
        head.next.next.next=new Node(25);
        printList(head);
        printList(sort(head));

    }
}
