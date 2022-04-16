package lambda;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class RemoveEven {

    public static void main(String[] args) {
        ArrayList<Integer> c=new ArrayList<>();
        c.add(10);
        c.add(15);
        c.add(20);
        c.add(25);
        c.forEach(System.out::println);//x->System.out.println(x):
        Integer[] arr=c.toArray(c.toArray(new Integer[0]));
        for (Integer integer : arr) {
            System.out.print(integer + " ");
        }
        c.removeIf(n->n%2==0);
        System.out.println(c);
        ArrayList<Integer> list=new ArrayList<>();
        list.add(12);
        list.add(45);
        list.add(89);
        list.add(21);
        list.add(62);
        list.add(32);
        list.stream().filter(x->x>10).filter(x->x%2==0).forEach(x-> System.out.print(x+" "));

    }
}
