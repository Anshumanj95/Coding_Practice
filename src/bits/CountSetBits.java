package bits;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class CountSetBits {
    // time taken as of  no.of bits
    public static int count(int n){
        int res=0;
        while(n>0){
            res=res+(n&1);      //if(n%2!=0)->res++ //if((n&1)==1)->res++
            n=n>>1;             //n=n/2
        }
        return res;
    }
    //Brain Kerningam algo. time of set bit count
    public static int count2(int n){
        int res=0;
        while(n>0){
            n=(n&(n-1)); // by and of current value by its -1 value we get set bit as 0 and after set bit all value are 0
            res++;
        }
        return res;
    }
    public static void initialize(int[] lookup){
        lookup[0]=0;
        for (int i=1;i<256;i++){
            lookup[i]=lookup[i>>1]+(((i & 1)==1)?1:0);
        }
    }
    public static void main(String[] args) {
        int[] lookup=new int[256];
        initialize(lookup);
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int count=0;
        for (int i=0;i<4;i++){
            count+=lookup[(n&255)];
            n=n>>8;
        }
        System.out.println(count);

    }
}
