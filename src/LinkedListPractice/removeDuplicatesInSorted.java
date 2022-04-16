package LinkedListPractice;
import LinkedListPractice.MyLinkedList.*;

import java.util.HashSet;

import static LinkedListPractice.MyLinkedList.printList;

public class removeDuplicatesInSorted {
    //sorted
    public static void remove(Node head){
        Node curr=head;
        while (curr!=null && curr.next!=null){
            if(curr.data==curr.next.data){
                curr.next=curr.next.next;
            }
            else
                curr=curr.next;
        }
    }
    //unsorted
    public Node removeDuplicates(Node head)
    {
        // Your code here
        HashSet<Integer> set=new HashSet<>();
        Node curr=head;
        while(curr!=null && curr.next!=null){
            set.add(curr.data);
            if(set.contains(curr.next.data)){
                curr.next=curr.next.next;
            }
            else{
                curr=curr.next;
            }
        }
        return head;
    }
    public static Node removeAllDuplicate(Node head){
        if (head==null && head.next==null)
            return head;
        Node curr=head;
        Node prev=null;
        while (curr!=null &&curr.next!=null){
            if (curr.data==curr.next.data){
                while (curr.next!=null && curr.data==curr.next.data)
                    curr=curr.next;
                if (prev!=null){
                    prev.next=curr.next;
                }
                else{
                    head=curr.next;
                }
            }
            else {
                prev=curr;
            }
            curr=curr.next;
        }
        return head;
    }
    public static void main(String[] args) {
        Node head=new Node(10);
        head.next=new Node(20);
        head.next.next=new Node(30);
        head.next.next.next=new Node(30);
        head.next.next.next.next=new Node(30);
        printList(head);
        remove(head);
        printList(head);
    }
}
