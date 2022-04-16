package LinkedListPractice;
import static LinkedListPractice.MyLinkedList.*;
public class Palindrome {
    static boolean isPalindrome(Node head)
    {
        if(head==null)
            return true;
        Node slow=head;
        Node fast=head;
        while(fast.next!=null && fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        Node rev=reverse(slow.next);
        Node curr=head;
        while(rev!=null){
            if(rev.data!=curr.data)
                return false;
            curr=curr.next;
            rev=rev.next;
        }
        return true;
    }
    public static Node reverse(Node head){
        Node curr=head;
        Node prev=null;
        while (curr!=null){
            Node  next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        return prev;
    }

    public static void main(String[] args) {
        Node head=new Node(10);
        Node l1=new Node(20);
        Node l2=new Node(20);
        Node l3=new Node(10);
        head.next=l1;
        l1.next=l2;
        l2.next=l3;
        System.out.println(isPalindrome(head));
    }

}
