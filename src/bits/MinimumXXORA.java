package bits;

public class MinimumXXORA {
    public static int countBits(int n){
        int count=0;
        while (n>0){
            count=count+(n&1);
            n=n>>1;
        }
        return count;
    }
    public static int minVal(int a,int b){
        int bitsA=countBits(a);
        int bitsB=countBits(b);
        int diff=Math.abs(bitsA-bitsB);
        if (diff==0)
            return a;
        if(bitsA>bitsB){
            while (diff>0){
                //change 1 to 0
                a=a&(a-1);
                diff--;
            }
        }
        else{
            while (diff>0){
                //change 0 to 1
                a=a|(a+1);
                diff--;
            }
        }
        return a;
    }
    public static void main(String[] args) {

    }
}
