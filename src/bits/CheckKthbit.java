package bits;

public class CheckKthbit {
    public static boolean check(int n,int k){
        return (n &(1<<k))!=0;
    }
    public static void main(String[] args) {
        System.out.println(check(500,3));
    }
}
