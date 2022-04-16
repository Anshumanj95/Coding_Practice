package bits;

public class SwapOddEven {
    public static int Swap(int n){
        int even=(n&0xAAAAAAAA);// a 32 bit number has all even bits as 1 and odd bit as 0
        int odd=(n&0x55555555);// a 32 bit number has all even bits as 0 and odd bit as 1
        even=even>>1;
        odd=odd<<1;
        return (even|odd);
    }
    public static void main(String[] args) {
        System.out.println(Swap(23));
    }
}
