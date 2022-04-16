package bits;

public class GrayToBinary {
    public static int btoG(int n){
        return n^(n>>1);
    }
    public static  int gtoB(int n){
        int res=n;
        while(n>0){
            n=n>>1;
            res=res^n;
        }
        return res;
    }
    public static void main(String[] args) {
        int n=4;
        System.out.println(gtoB(n));
        int n2=7;
        System.out.println(btoG(n2));
    }
}
