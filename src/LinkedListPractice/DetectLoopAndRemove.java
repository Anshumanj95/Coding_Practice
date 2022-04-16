package LinkedListPractice;
import static LinkedListPractice.MyLinkedList.*;

import java.util.HashSet;

public class DetectLoopAndRemove {
    public static boolean detectLoopByHashing(Node head){
        HashSet<Node> h=new HashSet<>();
        for(Node curr=head;curr!=null;curr=curr.next){
            if(h.contains(curr))
                return true;
            h.add(curr);
        }
        return false;
    }
    public static boolean floyd(Node head){
        Node slow=head;
        Node fast=head;
        while(fast!=null && fast.next!=null)
            {
                slow = slow.next;
                fast = fast.next.next;
                if(fast==slow)
                    return true;
            }
        return false;
    }
    public static void removeLoop(Node head){
        Node slow=head;
        Node fast=head;
        while (fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(fast==slow)
                break;
        }
        if(fast!=slow)
            return;
        slow=head;
        while(slow.next!=fast.next){
            slow=slow.next;
            fast=fast.next;
        }
        fast.next=null;
    }
    public static int loopLength(Node head){
        Node slow=head;
        Node fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast)
                break;
        }
        int length=0;
        do {
            assert slow != null;
            slow=slow.next;
            length++;
        }while (slow!=fast);
        return length;
    }
    public static void firstNodeOfLoop(Node head){
        Node slow=head;
        Node fast=head;
        while (fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(fast==slow)
                break;
        }
        if(fast!=slow)
            return;
        slow=head;
        while(slow.next!=fast.next){
            slow=slow.next;
            fast=fast.next;
        }
        System.out.println(fast.next.data);

    }
    public static void main(String[] args) {
        Node head=new Node(10);
        Node l1=new Node(20);
        Node l2=new Node(30);
        Node l3=new Node(34);
        head.next=l1;
        l1.next=l2;
        l2.next=l3;
        l3.next=l1;
        firstNodeOfLoop(head);
    }
}
