package LinkedListPractice;
import static LinkedListPractice.DoublyLinkedList.*;
public class mergerSortDLL {
    public static Node sort(Node head){
        if(head==null||head.next==null)
            return head;
        Node slow=head;
        Node fast=head;
        while (fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        slow.prev.next=null;
        Node left=sort(head);
        Node right=sort(slow.next);
        return merge(left,right);
    }
    public static Node merge(Node a,Node b){
        if(a==null) return b;
        if(b==null) return a;
        Node head=null,tail=null;
        if(a.data<= b.data){
            head=tail=a;
            a=a.next;
        }
        else{
            head=tail=b;
            b=b.next;
        }
        head.prev=null;
        while (a!=null && b!=null){
            if(a.data<=b.data){
                tail.next=a;
                a.prev=tail;
                tail=a;
                a=a.next;
            }
            else{
                tail.next=b;
                b.prev=tail;
                tail=b;
                b=b.next;
            }
        }
        if(a==null){
            tail.next=b;
            b.prev=tail;
        }
        else{
            tail.next=a;
            a.prev=tail;
        }
        return head;
    }
    public static void main(String[] args) {

    }
}
