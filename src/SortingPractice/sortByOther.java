package SortingPractice;

import java.util.*;

public class sortByOther {
    static class pair{
        int i;
        int c;
        pair(int i,int c){
            this.i=i;
            this.c=c;
        }

    }
    public static void sort(int[] a,int[] b){
        pair[] p=new pair[a.length];
        for(int i=0;i<a.length;i++){
            p[i]=new pair(a[i],b[i]);
        }
        Arrays.sort(p,(p1,p2)->p1.i-p2.i);
        for(pair e:p){
            System.out.print(e.c+" ");
        }
    }
    public static void main(String[] args) {
        int[] a={2, 1, 2, 5, 7, 1, 9, 3, 6, 8, 8};
        int [] c={2, 1, 8, 3};
        sort(a,c);

    }
}
