package LinkedListPractice;
import static LinkedListPractice.MyLinkedList.*;
public class SwapKthNodeFromEnds {
    public static Node swapKthNode(Node head,int n,int k){
        if(k>n)
            return head;
        Node first=head,prev1=null,second=head,prev2=null;
        for(int i=1;i<k;i++){
            prev1=first;
            first=first.next;
        }
        for (int i=1;i<n-k+1;i++){
            prev2=second;
            second=second.next;
        }
        if(prev1!=null)
            prev1.next=second;
        if(prev2!=null)
            prev2.next=first;
        Node temp=first.next;
        first.next=second.next;
        second.next=temp;
        if(k==1)    head=second;
        if(k==n)    head=first;
        return head;
    }
    public static void main(String[] args) {

    }
}
