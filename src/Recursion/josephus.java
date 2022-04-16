package Recursion;

public class josephus {
    public static int jos(int n,int k){
        if(n==1)
            return 0;
        return (jos(n-1,k)+k)%n;
    }
    //for return 1 to n number
    public static int j(int n,int k){
        if(n==1)
            return 1;
        return (j(n-1,k)+k-1)%n+1;
    }
    public static void main(String[] args) {

        System.out.println(jos(5,3));
        System.out.println(j(5,3));
    }
}
