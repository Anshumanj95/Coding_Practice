package set;
import java.util.*;
public class main {
    public static void main(String[] args) {
        Set<Integer> s=new TreeSet<>();
        s.add(10);
        s.add(20);
        s.add(30);
        s.add(20);
        System.out.println(s);
    }
}
