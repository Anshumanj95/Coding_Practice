package Recursion;

public class friendpair {
    public static int pair(int n){
        if(n==0||n==1||n==2)
            return n;
        return pair(n-1)+pair(n-2)*(n-1);
    }
    public static void main(String[] args) {
        System.out.println(pair(4));
    }
}
