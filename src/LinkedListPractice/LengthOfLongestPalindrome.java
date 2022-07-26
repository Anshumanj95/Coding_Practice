package LinkedListPractice;
import java.util.LinkedList;

import static LinkedListPractice.MyLinkedList.Node;


public class LengthOfLongestPalindrome {
    public static int maxLength(Node head){
        Node curr=head,prev=null;
        int ans=0;
        while (curr!=null){
            Node next=curr.next;
            curr.next=prev;
            ans=Math.max(ans,2*isPal(next,curr));
            ans=Math.max(ans,2*isPal(next,prev)+1);
            prev=curr;
            curr=next;
        }
        return ans;
    }
    public static int isPal(Node head1,Node head2){
        Node curr1=head1,curr2=head2;
        int count=0;
        while (curr1!=null && curr2!=null){
            if (curr1.data==curr2.data){
                count++;
                curr1=curr1.next;
                curr2=curr2.next;
            }
            else
                return count;
        }
        return count;
    }
    public static void main(String[] args) {
        Node head=new Node(2);
        head.next=new Node(3);
        head.next.next=new Node(7);
        head.next.next.next=new Node(3);
        head.next.next.next.next=new Node(2);
        head.next.next.next.next.next=new Node(1);
        head.next.next.next.next.next.next=new Node(2);
        head.next.next.next.next.next.next.next=new Node(2);
        head.next.next.next.next.next.next.next.next=new Node(4);
        System.out.println(maxLength(head));
    }
}
