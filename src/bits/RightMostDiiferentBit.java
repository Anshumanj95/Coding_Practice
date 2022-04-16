package bits;

public class RightMostDiiferentBit {
    public static int posOfDifferentBit(int n,int m){
        int xor=n^m;
        //find first set bit
        if(xor>=1)
            return xor&-xor;
        else
            return -1;
    }
    public static void main(String[] args) {
        System.out.println(posOfDifferentBit(11,9));
    }
}
