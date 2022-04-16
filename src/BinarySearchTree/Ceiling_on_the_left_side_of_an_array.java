package BinarySearchTree;

import java.util.Iterator;
import java.util.TreeSet;

public class Ceiling_on_the_left_side_of_an_array{
    public static void ceiling(int[] arr){
        System.out.print(-1+" ");
        TreeSet<Integer> t=new TreeSet<>();
        t.add(arr[0]);
        for(int i=1;i<arr.length;i++){
            if(t.ceiling(arr[i])!=null)
                System.out.print(t.ceiling(arr[i])+" ");
            else
                System.out.print(-1+" ");
            t.add(arr[i]);
        }
    }
    public static void main(String[] args) {
        int[] arr={2,8,30,15,25,12};
        ceiling(arr);
    }
}
