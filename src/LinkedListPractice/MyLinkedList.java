package LinkedListPractice;

public class MyLinkedList {

    static class Node{
        int data;
        Node next;
        Node(int x){
            data=x;
            next=null;
        }
    }
    public static Node prepend(Node head,int x){
        Node temp=new Node(x);
        temp.next=head;
        return temp;
    }
    public static Node append(Node head,int x){
        Node temp=new Node(x);
        if(head==null)
            return temp;
        Node curr=head;
        while (curr.next!=null){
            curr=curr.next;
        }
        curr.next=temp;
        return head;
    }
    public static Node insertAt(Node head,int pos,int data){
        Node temp=new Node(data);
        if(pos==1){
            temp.next=head;
            return temp;
        }
        Node curr=head;
        for(int i=1;i<=pos-2 && curr!=null;i++)
            curr=curr.next;
        if (curr==null)
            return head;
        temp.next=curr.next;
        curr.next=temp;
        return head;
    }
    public static Node deleteHead(Node head){
        if(head==null)
            return null;
        else
            return head.next;
    }
    public static Node deleteLast(Node head){
        if(head==null|| head.next==null)
            return null;
        Node curr=head;
        while(curr.next.next!=null)
            curr=curr.next;
        curr.next=null;
        return head;
    }
    public static int search(Node head,int x){
//        int pos=1;
//        Node curr=head;
//        while (curr!=null){
//            if(curr.data==x)
//                return pos;
//            else{
//                pos++;
//                curr=curr.next;
//            }
//        }
//        return -1;
        if(head==null)
            return -1;
        if(head.data==x)
            return 1;
        else{
            int res=search(head.next,x);
            if(res==-1)
                return -1;
            return res+1;
        }
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
        Node head=new Node(10);
        head.next=new Node(20);
        head.next.next=new Node(30);
        printList(head);


    }
}

