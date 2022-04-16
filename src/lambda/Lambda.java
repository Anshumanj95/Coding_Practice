package lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.function.Predicate;

public class   Lambda
{
    public static void even(Collection<Integer> c, Predicate<Integer> p){
        for(Integer x:c){
            if(p.test(x)){
                System.out.print(x+" ");
            }
        }
    }
    public static void printsquare(int x){
        System.out.print(x*x+" ");
    }
    public static void main(String[] args) {
        List<Integer> a=new ArrayList<>(Arrays.asList(10,7,20,30,9,40));
        even(a,x->x%2==0);
        System.out.println();
        a.forEach(Lambda::printsquare);
        String b[]={"anshuman","partiksha","jain"};
        String c[]={"Anshuman","Partiksha","Jain"};
        if(Arrays.equals(b,c,String::compareToIgnoreCase))
            System.out.println("yes");
        else
            System.out.println("No");
    }

} 