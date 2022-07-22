package LinkedListPractice;
import static LinkedListPractice.MyLinkedList.*;
public class PartitionList {
    // partition list as all node less tha x come before all node greater than or equal.
    // make two list one for small and one of greater equal at the end join them
    public static Node partition(Node head,int x){
        if (head==null)
            return head;
        Node shead=null;
        Node stail=shead;
        Node ghead=null;
        Node gtail=ghead;
        Node curr=head;
        while (curr!=null){
            if (curr.data<x){
                if (shead==null){
                    shead=curr;
                    stail=shead;
                }
                else{
                    stail.next=curr;
                    stail=stail.next;
                }
            }
            else{
                if (ghead==null){
                    ghead=curr;
                    gtail=ghead;
                }
                else{
                    gtail.next=curr;
                    gtail=gtail.next;
                }
            }
            curr=curr.next;
        }
        if (shead==null || ghead==null)
            return head;
        stail.next=ghead;
        gtail.next=null;
        return shead;
    }
    public static void main(String[] args) {


    }
}
