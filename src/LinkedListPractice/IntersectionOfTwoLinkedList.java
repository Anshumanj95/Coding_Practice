package LinkedListPractice;
import static LinkedListPractice.MyLinkedList.*;
public class IntersectionOfTwoLinkedList {
    public static Node intersection(Node head1,Node head2){
        Node a=head1;
        Node b=head2;
        Node list=null;
        Node head=null;
        while(a!=null&&b!=null){
            if(a.data==b.data){
                if(list==null){
                    head=new Node(a.data);
                    list=head;
                }
                else{
                    list.next=new Node(a.data);
                    list=list.next;
                }
                a=a.next;
                b=b.next;
            }
            else if(a.data<b.data)
                a=a.next;
            else
                b=b.next;
        }
        return (head);
    }
    public static int intersectPoint(Node head1, Node head2)
    {
        // code here
        if (head1==null || head2==null)
            return -1;
        int c1=0;
        int c2=0;
        Node curr1=head1;
        Node curr2=head2;
        while (curr1!=null){
            curr1= curr1.next;
            c1++;
        }
        while (curr2!=null){
            curr2=curr2.next;
            c2++;
        }
        System.out.println(c1+" "+c2);
        int d=Math.abs(c1-c2);
        curr1=head1;
        curr2=head2;
        if (c1>c2){
            while (d-->0){
                curr1=curr1.next;
            }
        }
        else{
            while (d-->0){
                curr2= curr2.next;
            }
        }
        while (curr1!=null && curr2!=null){
            if (curr1.data==curr2.data)
                return curr1.data;
            curr1=curr1.next;
            curr2= curr2.next;
        }
        return -1;
    }
    public static void main(String[] args) {
        Node head1 = new Node(1);
        head1.next = new Node(2);
        head1.next.next=new Node(3);
        head1.next.next.next=new Node(4);
        head1.next.next.next.next=new Node(5);
        head1.next.next.next.next.next=new Node(6);
        Node head2=new Node(4);
        head2.next=new Node(5);
        head2.next.next=new Node(6);
        System.out.println(intersectPoint(head1,head2));
        printList(intersection(head1,head2));
    }
}
