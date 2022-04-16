package set;
import java.util.*;
public class UnionIntersection {
    public static void doUnion(int a[], int n, int b[], int m)
    {
        HashSet<Integer> h1=new HashSet<>();
        for(int i=0;i<n;i++){
            h1.add(a[i]);
        }
        HashSet<Integer> h2=new HashSet<>();
        for(int i=0;i<m;i++){
            h2.add(b[i]);
        }
        h1.addAll(h2);
        System.out.println(h1);

    }
    public static void doIntersection(int a[], int n, int b[], int m)
    {
        //Your code here
        HashSet<Integer> h1=new HashSet<>();
        for(int i=0;i<n;i++){
            h1.add(a[i]);
        }
        HashSet<Integer> h2=new HashSet<>();
        for(int i=0;i<m;i++){
            h2.add(b[i]);
        }
        h1.retainAll(h2);
        System.out.println(h1);
    }
    public static void difference(int a[], int n, int b[], int m)
    {
        //Your code here
        HashSet<Integer> h1=new HashSet<>();
        for(int i=0;i<n;i++){
            h1.add(a[i]);
        }
        HashSet<Integer> h2=new HashSet<>();
        for(int i=0;i<m;i++){
            h2.add(b[i]);
        }
        h1.removeAll(h2);
        System.out.println(h2);

    }

    public static void main(String[] args) {
        int[] a={1,2,3,4,5};
        int[] b={1,6,8,3};
        doUnion(a,a.length,b,b.length);
        doIntersection(a,a.length,b,b.length);
        difference(a,a.length,b,b.length);
    }
}
