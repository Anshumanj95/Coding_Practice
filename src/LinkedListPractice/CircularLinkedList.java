package LinkedListPractice;

public class CircularLinkedList {
    static class Node{
        int data;
        Node next;
        Node(int x){
            data=x;
            next=null;
        }
    }
    public static void printList(Node head){
        if(head==null)
            return;
        Node r=head;
        do {
            System.out.print(r.data+" ");
            r=r.next;
        }while (r!=head);
        System.out.println();
    }
    public static Node prepend(Node head,int x){
        Node temp=new Node(x);
        //in O(1)
//        if(head==null){
//            temp.next=temp;
//            return temp;
//        }
//        else{
//            //insert new node int between head and second node
//            temp.next=head.next;
//            head.next=temp;
//            //swap the data of new node and head node
//            int t=head.data;
//            head.data= temp.data;
//            temp.data=t;
//            return head;
//        }
        //i O(n) naive method
        if(head==null)
            temp.next=temp;
        else{
            Node curr=head;
            while(curr.next!=head){
                curr=curr.next;
            }
            curr.next=temp;
            temp.next=head;
        }
        return temp;

    }
    public static Node append(Node head,int x){
        Node temp=new Node(x);
        //in O(1) same as prepend in this we return temp
//        if(head==null){
//            temp.next=temp;
//        }
//        else{
//            temp.next=head.next;
//            head.next=temp;
//            int t=temp.data;
//            temp.data= head.data;
//            head.data=t;
//        }
//        return temp;
        if(head==null){
            temp.next=temp;
            return temp;
        }
        else{
            Node curr=head;
            while (curr.next!=head){
                curr=curr.next;
            }
            curr.next=temp;
            temp.next=head;
            return head;
        }
    }
    public static Node deleteHead(Node head){
        if(head==null || head.next==head)
            return null;
        // O(n)
//        Node curr=head;
//        while(curr.next!=head){
//            curr=curr.next;
//        }
//        curr.next=head.next;
//        return curr.next;
        //O(1) simply swap data of head and next to it and delete head next
        head.data=head.next.data;
        head.next=head.next.next;
        return head;
    }
    public static Node deleteKthNode(Node head,int k){
        if(head==null)
            return head;
        if(k==1)
            return deleteHead(head);
        Node curr=head;
        for(int i=0;i<k-2;i++)
            curr=curr.next;
        curr.next=curr.next.next;
        return head;
    }
    public static void main(String[] args) {
        Node head=new Node(10);
        head.next=new Node(14);
        head.next.next=new Node(30);
        head.next.next.next=new Node(80);
        head.next.next.next.next=head;
        printList(head);
        printList(prepend(head,3));
        printList(append(head,23));
        printList(deleteHead(head));
        printList(deleteKthNode(head,3));
    }
}
