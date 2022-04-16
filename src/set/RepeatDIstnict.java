package set;
import java.util.*;
public class RepeatDIstnict {
    public static void printDist(int[] arr)
    {
        HashSet<Integer> s = new HashSet<Integer>();

        for(int i=0; i<arr.length; i++)
        {
            if(!s.contains(arr[i]))
            {
                System.out.print(arr[i] + " ");
                s.add(arr[i]);
            }
        }
    }
    public static void printRepeating(int[] arr)
    {
        HashSet<Integer> s = new HashSet<Integer>();

        for(int i=0; i<arr.length; i++)
        {
            if(s.contains(arr[i]))
            {
                System.out.print(arr[i] + " ");
            }
            else
                s.add(arr[i]);
        }
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,1,2,3,5,6};
        printDist(arr);
        System.out.println();
        printRepeating(arr);
    }
}
