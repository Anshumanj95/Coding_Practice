package LinkedListPractice;

public class FlatteningOfLinkedList {
    static class Node
    {
        int data;
        Node next;
        Node bottom;

        Node(int d)
        {
            data = d;
            next = null;
            bottom = null;
        }
    }
    public static Node flattening(Node root){
        if(root==null||root.next==null)
            return root;
        root.next=flattening(root.next);
        root=merge(root,root.next);
        return root;
    }
    public static Node merge(Node a,Node b){
        Node curr=new Node(-1);
        Node res=curr;
        while (a!=null && b!=null){
            if (a.data<=b.data){
                curr.bottom=a;
                curr=curr.bottom;
                a=a.bottom;
            }
            else{
                curr.bottom=b;
                curr=curr.bottom;
                b=b.bottom;
            }
        }
        if (a==null)
            curr.bottom=b;
        if (b==null)
            curr.bottom=a;
        return res.bottom;
    }
    public static void main(String[] args) {

    }
}
