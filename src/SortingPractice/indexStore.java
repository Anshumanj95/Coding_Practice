package SortingPractice;
import java.awt.geom.Area;
import java.util.*;
public class indexStore {
    static class array{
        int item;
        int index;
        array(int item,int index){
            this.item=item;
            this.index=index;
        }
    }
    public static void sort(int[] arr){
        array[] al=new array[arr.length];
        for(int i=0;i<arr.length;i++){
            al[i]=new array(arr[i],i);
        }
        Arrays.sort(al,(a1,a2)-> a1.item- a2.item);
        for(array e:al){
            System.out.println(e.index+" "+e.item);
        }
    }
    public static void main(String[] args) {
        int[] arr={10,40,30,20};
        sort(arr);

    }
}
