package stack;

import java.util.LinkedList;

public class StackUsingLinkedList {
    class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    class Stack{
        Node head;
        int size=0;

        public Stack(){
            head=null;
        }
        public boolean isEmpty(){
            return size==0;
        }
        public int size(){
            return size;
        }
        public void push(int x){
            size++;
            Node temp=new Node(x);
            temp.next=head;
            head=temp;
        }
        public void pop(){
            if (size>=1){
                head=head.next;
                size--;
            }
        }
        public int getTop(){
            if (size>=1)
                return head.data;
            return -1;
        }
    }
    public static void main(String[] args) {

    }
}
