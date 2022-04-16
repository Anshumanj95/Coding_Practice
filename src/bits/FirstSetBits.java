package bits;

public class FirstSetBits {
    public static int find(int n){
        int pos=0;
        while(n>0){
            pos++;
            if((n&1)==1)
                return pos;
            n=n>>1;
        }
        return pos;
        //log2(n &~(n-1))+1
//        if(n>=1)
//            return (int)(((Math.log((n&-n)))/Math.log(2))+1);
//        else
//            return 0;
    }
    public static void main(String[] args) {
        System.out.println(find(18));
    }
}
