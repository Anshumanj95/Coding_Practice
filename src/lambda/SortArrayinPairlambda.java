package lambda;

import java.util.Arrays;
import java.util.Scanner;

class Pair{
    int x;
    int y;
    Pair(int x,int y){
        this.x=x;
        this.y=y;
    }
}
class compare{
    public static void sortPair(Pair arr[],int n){

        Arrays.sort(arr,(p1,p2)->p1.x-p2.x);
        for(int i=0;i<n;i++){
            System.out.print(arr[i].x+" "+arr[i].y+" ");
        }
    }
}
public class SortArrayinPairlambda {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        Pair arr[]=new Pair[n];
        for(int i=0;i<n;i++){
            int x=sc.nextInt();
            int y=sc.nextInt();
            arr[i]=new Pair(x,y);
        }
        compare.sortPair(arr,n);
    }
}
