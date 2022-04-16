package LinkedListPractice;
import java.util.ArrayList;

import static LinkedListPractice.MyLinkedList.*;
public class CountTriplets {
    public static int countTriplet(Node head,int x){
        ArrayList<Integer> arr=new ArrayList<>();
        Node curr=head;
        while (curr!=null){
            arr.add(curr.data);
            curr=curr.next;
        }
        int count=0;
        int n=arr.size();
        for (int i=0;i<n-2;i++){
            int j=i+1;
            int k=n-1;
            while (j<k){
                if (arr.get(i)+arr.get(j)+arr.get(k)==x){
                    count++;
                    j++;
                    k--;
                }
                else if (arr.get(i)+arr.get(j)+arr.get(k)>x)
                    k--;
                else
                    j++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Node head=new Node(1);
        head.next=new Node(2);
        head.next.next=new Node(4);
        head.next.next.next=new Node(5);
        head.next.next.next.next=new Node(6);
        head.next.next.next.next.next=new Node(8);
        head.next.next.next.next.next.next=new Node(9);
        System.out.println(countTriplet(head,17));

    }
}
