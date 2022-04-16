package LinkedListPractice;
import static LinkedListPractice.MyLinkedList.*;
public class MergeTwoSortedLinkedList {
    public static Node merge(Node a,Node b){
        if(a==null) return b;
        if (b==null) return a;
        Node head=null,tail=null;
        if(a.data<=b.data){
            head=tail=a;
            a=a.next;
        }
        else{
            head=tail=b;
            b=b.next;
        }
        while(a!=null && b!=null){
            if(a.data<=b.data){
                tail.next=a;
                tail=a;
                a=a.next;
            }
            else{
                tail.next=b;
                tail=b;
                b=b.next;
            }
        }
        if(a==null)
            tail.next=b;
        else
            tail.next=a;
        return head;

    }
    public static void main(String[] args) {
        Node a=new Node(10);
        a.next=new Node(12);
        a.next.next=new Node(56);
        Node b=new Node(4);
        b.next=new Node(7);
        b.next.next=new Node(34);
        printList(a);
        printList(b);
        printList(merge(a,b));
    }
}
