package ArrayPractice;

import java.util.Arrays;

public class SmallestPositiveMissing {
    public static int find(int[] arr){
        int n=arr.length;
        int N=(int)10e6+2;
        boolean[] check=new boolean[N];
        Arrays.fill(check,false);
        for(int i=0;i<n;i++){
            if(arr[i]>=0){
                check[arr[i]]=true;
            }
        }
        for (int i=1;i<N;i++){
            if(!check[i])
                return i;
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        System.out.println(find(arr));
    }
}
