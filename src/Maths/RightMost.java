package Maths;

public class RightMost {
    public static int rightmostNonZeroDigit(int n, int[] a){
        // code here
        int x=1;
        int cnt2=0;
        int cnt5=0;
        for(int i=0;i<n;i++){
            if(a[i]==0)
                return -1;
            while(a[i]%2==0){
                cnt2++;
                a[i]/=2;;
            }
            while(a[i]%5==0){
                cnt5++;
                a[i]/=5;
            }
            x=(x*a[i])%10;
        }
        int y= java.lang.Math.min(cnt2,cnt5);
        cnt2-=y;
        cnt5-=y;
        for(int i=0;i<cnt2;i++)
            x=(x*2)%10;
        for(int i=0;i<cnt5;i++)
            x=(x*5)%10;
        return x;

    }
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        System.out.println(rightmostNonZeroDigit(arr.length,arr));

    }
}
