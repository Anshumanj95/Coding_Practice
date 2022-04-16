package LinkedListPractice;
import static LinkedListPractice.MyLinkedList.*;
public class Merge_K_sorted_linked_lists {
    public static Node mergeKList(Node[]arr,int k)
    {
        //Add your code here.
        int last=k-1;
        int i,j;
        while(last!=0){
            i=0;j=last;
            while(i<j){
                arr[i]=merge(arr[i],arr[j]);
                i++;j--;
                if(i>=j){
                    last=j;
                }
            }
        }
        return arr[0];
    }
    public static Node merge(Node a,Node b){
        if(a==null) return b;
        if(b==null) return a;
        Node head=null,tail=null;
        if(a.data<=b.data){
            head=tail=a;
            a=a.next;
        }
        else{
            head=tail=b;
            b=b.next;
        }
        while(a!=null && b!=null){
            if(a.data<=b.data){
                tail.next=a;
                tail=a;
                a=a.next;
            }
            else{
                tail.next=b;
                tail=b;
                b=b.next;
            }
        }
        if(a!=null) tail.next=a;
        if(b!=null) tail.next=b;

        return head;
    }
    public static void main(String[] args) {

    }
}
