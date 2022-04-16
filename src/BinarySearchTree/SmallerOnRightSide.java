package BinarySearchTree;
import java.util.TreeSet;

import static BinarySearchTree.Node_class.Node;
//headSet function gives set of smaller elements than present key in tree
public class SmallerOnRightSide {
    public static void count(int[] arr){
        if(arr.length==0){
            System.out.println(0);
            return;
        }
        TreeSet<Integer> s=new TreeSet<>();
        int count=Integer.MIN_VALUE;
        for(int i=arr.length-1;i>=0;i--){
            s.add(arr[i]);
            count=Math.max(count,s.headSet(arr[i]).size());
        }
        System.out.println(count);
    }
    public static void main(String[] args) {
        int[] arr={10,6,9,7,20,19,21,18,17,16};
        count(arr);
    }
}
