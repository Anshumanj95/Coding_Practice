package LinkedListPractice;
import static LinkedListPractice.MyLinkedList.*;
public class QuickSort {
    public static Node sort(Node head){
        Node curr=head;
        while(curr!=null&&curr.next!=null)
            curr=curr.next;
        quickSort(head,curr);
        return head;
    }
    public static void quickSort(Node head, Node end){
        if(head==null|| head==end||head==end.next)
            return;
        Node pivot=partition(head,end);
        quickSort(head,pivot);
        if (pivot!=null && pivot==head)
            quickSort(pivot.next,end);
        else if (pivot!=null && pivot.next!=null)
            quickSort(pivot.next.next,end);

    }
    public static Node partition(Node head,Node end){
        if (head==end|| head==null || end==null)
            return head;
        Node pivot_prev=head;
        Node curr=head;
        int pivot=end.data;
        while (head!=end){
            if (head.data<pivot){
                pivot_prev=curr;
                int temp= curr.data;
                curr.data=head.data;
                head.data=temp;
                curr=curr.next;
            }
            head=head.next;
        }
        int temp= curr.data;
        curr.data=pivot;
        end.data=temp;
        return pivot_prev;
    }

    public static void main(String[] args) {
        Node head=new Node(15);
        head.next=new Node(4);
        head.next.next=new Node(7);
        head.next.next.next=new Node(9);
        head.next.next.next.next=new Node(8);
        printList(head);
        printList(sort(head));

    }
}
