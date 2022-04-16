package LinkedListPractice;
import static LinkedListPractice.MyLinkedList.*;
public class MergeSort {
    public static Node sort(Node head){
        if(head==null || head.next==null)
            return head;
        Node mid=findMid(head);
        Node left=head;
        Node right=mid.next;
        mid.next=null;
        left=sort(left);
        right=sort(right);
        return merge(left,right);
    }
    public static Node findMid(Node head){
        Node slow=head,fast=head.next;
        while (fast!=null &&fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
    public static Node merge(Node a,Node b){
        if(a==null) return b;
        if (b==null) return a;
        Node ans=new Node(-1);
        Node tail=ans;
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
        return ans.next;

    }
    public static void main(String[] args) {
        Node head=new Node(13);
        head.next=new Node(10);
        head.next.next=new Node(1);
        head.next.next.next=new Node(5);
        head.next.next.next.next=new Node(40);
        printList(sort(head));

    }
}
