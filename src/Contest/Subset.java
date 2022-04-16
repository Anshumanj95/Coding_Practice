package Contest;
import java.util.*;
public class Subset {
    public static boolean hasSubset(ArrayList<Integer>arr1, ArrayList<Integer>arr2)
    {
        //Your code here
        HashSet<Integer> h=new HashSet<>();
        for(int i=0;i<arr1.size();i++){
            if(!h.contains(arr1.get(i)))
                h.add(arr1.get(i));
        }
        for(int i=0;i<arr2.size();i++){
            if(!h.contains(arr2.get(i)))
                return false;
        }
        return true;
    }
    public static void main(String[] args) {
    ArrayList<Integer> al=new ArrayList<>();
    al.add(1);
    al.add(2);
    al.add(3);
    al.add(4);
    al.add(5);
    ArrayList<Integer> bl=new ArrayList<>();
    bl.add(5);
    bl.add(4);
    bl.add(6);
        System.out.println(hasSubset(al,bl));
    }
}
