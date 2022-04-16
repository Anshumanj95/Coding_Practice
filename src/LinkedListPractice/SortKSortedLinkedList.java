package LinkedListPractice;
import java.util.PriorityQueue;

import static LinkedListPractice.DoublyLinkedList.*;
public class SortKSortedLinkedList {
    public static Node sort(Node head,int k){
        PriorityQueue<Node> pq=new PriorityQueue<>((p1, p2)->p1.data-p2.data);
        if (head==null)
            return head;
        Node newHead=null,last=null;
        for (int i=0;head!=null&&i<=k;i++){
            pq.add(head);
            head=head.next;
        }
        while (!pq.isEmpty()){
            if(newHead==null){
                newHead=pq.peek();
                newHead.prev=null;
                last=newHead;
            }
            else{
                last.next=pq.peek();
                pq.peek().prev=last;
                last=pq.peek();
            }
            pq.poll();
            if (head != null)
            {
                pq.add(head);
                head = head.next;
            }
        }
        last.next = null;
        return newHead;
        }
    public static void main(String[] args) {



    }
}
