package bits;

public class twoOddOccur {
    public static void find(int[] arr){
        int n=arr.length;
        int xor=0;
        int res1=0;
        int res2=0;
        for(int i=0;i<n;i++)
            xor=xor^arr[i];
        int sn=xor&-xor;
        for(int i=0;i<n;i++){
            if((sn&arr[i])!=0)
                res1=res1^arr[i];
            else
                res2=res2^arr[i];
        }
        System.out.println(res1+" "+res2);
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,2,1,3,4,2,6,4,8,2};
        find(arr);
    }
}
