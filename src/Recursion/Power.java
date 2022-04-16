package Recursion;

public class Power {
    public static int power(int a,int b){
        if(b==0){
            return 1;
        }
        return power(a,b-1)*a;
    }
    public static void main(String[] args) {
        int ans=power(4,4);
        System.out.println(ans);
    }
}
