package LinkedListPractice;

public class DoublyLinkedList {
    static class Node{
        int data;
        Node next;
        Node prev;
        Node(int x){
            data=x;
            next=prev=null;
        }
    }
    public static Node prepend(Node head,int x){
        Node temp=new Node(x);
        temp.next=head;
        if(head!=null)
            head.prev=temp;
        return temp;
    }
    public static Node append(Node head,int x){
        Node temp=new Node(x);
        if(head==null){
            temp.next=head;
            return temp;
        }
        Node curr=head;
        while(curr.next!=null){
            curr=curr.next;
        }
        curr.next=temp;
        temp.prev=curr;
        return head;
    }
    public static Node deleteFirst(Node head){
        if(head==null|| head.next==null)
            return null;
        head=head.next;
        head.prev=null;
        return head;
    }
    public static Node deleteLast(Node head){
        if(head==null || head.next==null)
            return null;
        Node curr=head;
        while(curr.next!=null){
            curr=curr.next;
        }
        curr.prev.next=null;
        return head;
    }
    public static Node reverse(Node head){
        if(head==null|| head.next==null)
            return head;
        Node curr=head,prev=null;
        while (curr!=null){
            prev=curr.prev;
            curr.prev=curr.next;
            curr.next=prev;
            curr=curr.prev;
        }
        return prev.prev;
    }
    public static void printList(Node head){
        Node curr=head;
        while (curr!=null){
            System.out.print(curr.data+" ");
            curr=curr.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Node head=new Node(20);
        Node l1=new Node(30);
        Node l2=new Node(10);
        head.next=l1;
        l1.next=l2;
        l1.prev=head;
        l2.prev=l1;
        printList(head);
        head=prepend(head,5);
        printList(head);
        head=append(head,9);
        printList(head);
        printList(deleteLast(head));
    }
}
