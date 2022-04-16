package bits;

public class reverseBit {
    public static int reverse(int n){
        int rev=0;
        while (n>0){
            rev=((rev<<1)|(n&1));
            n>>=1;
        }
        return rev;
    }
    public static void main(String[] args) {
        System.out.println(reverse(14));
    }
}
