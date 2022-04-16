package Greedy;

import java.util.PriorityQueue;

public class HauffManCoding {
    static class Node{
        char ch;
        int freq;
        Node left;
        Node right;
        Node(char c,int  fre,Node left,Node right){
            ch=c;
            freq=fre;
            this.left=left;
            this.right=right;
        }
    }
    public static void PrintHCodes(char[] arr,int[] freq){
        PriorityQueue<Node> pq=new PriorityQueue<>((n1,n2)->n1.freq-n2.freq);
        for (int i=0;i<arr.length;i++)
            pq.add(new Node(arr[i],freq[i],null,null));

        while (pq.size()>1){
            Node left=pq.poll();
            Node right=pq.poll();
            pq.add(new Node('$',left.freq+right.freq,left,right));
        }
        printRec(pq.peek(),"");
    }
    public static void printRec(Node root,String str){
        if(root==null)
            return;
        if(root.ch!='$'){
            System.out.println(root.ch+" "+str);
        }
        printRec(root.left,str+"0");
        printRec(root.right,str+"1");
    }
    public static void main(String[] args) {
        char[] arr={'a','d','e','f'};
        int[] freq={30,40,80,60};
        PrintHCodes(arr,freq);
    }
}
