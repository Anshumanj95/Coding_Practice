package Recursion;

public class TowerOfHanoi {
    static long i=0;
    public static long toh(int n,int from,int to,int aux){
        if(n==1){
            System.out.println("move disk "+n+" from rod "+from+" to rod "+to);
            i++;
            return i;
        }
        i=toh(n-1,from,aux,to);
        System.out.println("move disk "+n+" from rod "+from+" to rod "+to);
        i++;
        i=toh(n-1,aux,to,from);
        return i;
    }
    public static void main(String[] args) {
        System.out.println(toh(2,1,3,2));
    }
}
