package LinkedListPractice;

import java.util.HashMap;

class Node1
{
    int data;
    Node1 next,random;
    Node1(int x)
    {
        data = x;
        next = random = null;
    }
}
public class CloneOfLinkedListWithRandom {
    public static void print(Node1 start)
    {
        Node1 ptr = start;
        while (ptr!=null)
        {
            System.out.println ( "Data = " + ptr.data + ", Random  = "+ ptr.random.data );
            ptr = ptr.next;
        }
    }
    //using hashing
    public static Node1 clone(Node1 head){
        HashMap<Node1,Node1> hm=new HashMap<>();
        for(Node1 curr=head;curr!=null;curr=curr.next)
            hm.put(curr,new Node1(curr.data));
        for(Node1 curr=head;curr!=null;curr=curr.next){
            Node1 cloneCurr=hm.get(curr);
            cloneCurr.next=hm.get(curr.next);
            cloneCurr.random=hm.get(curr.random);
        }
        return hm.get(head);
    }
    //best and tricky method does not use aux space
    public static Node1 clone2(Node1 head){
        Node1 next,temp;
        //step 1 put same Node1 as in original list side by one means
        //1->4->5->7 become 1->1->4->4->5->5->7->7
        for(Node1 curr=head;curr!=null;){
            next=curr.next;
            curr.next=new Node1(curr.data);
            curr.next.next=next;
            curr=next;
        }
        //step2
        //get random by simple traverse the list see below and try to understand
        for(Node1 curr=head;curr!=null;curr=curr.next.next)
            curr.next.random=(curr.random!=null)?(curr.random.next):null;
        //step 3 remove clone from the original list
        // is simple just try to understand using pen and paper
        Node1 original=head,copy=head.next;
        temp=copy;
        while (original!=null && copy!=null){
            original.next=(original.next!=null)?original.next.next: null;
            copy.next=(copy.next!=null)?copy.next.next: null;
            original=original.next;
            copy=copy.next;
        }
        return temp;
    }
    public static void main(String[] args)
    {
        Node1 head = new Node1(10);
        head.next = new Node1(5);
        head.next.next = new Node1(20);
        head.next.next.next = new Node1(15);
        head.next.next.next.next = new Node1(20);

        head.random = head.next.next;
        head.next.random=head.next.next.next;
        head.next.next.random=head;
        head.next.next.next.random=head.next.next;
        head.next.next.next.next.random=head.next.next.next;

        System.out.print( "Original list : \n");
        print(head);

        System.out.print( "\nCloned list : \n");
        Node1 cloned_list = clone(head);
        print(cloned_list);
    }
}
