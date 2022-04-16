package Contest;

import java.util.Scanner;

public class OptimalShuffleArray {
    //on odd index even value should come and on even index odd value
    public static void arrange(long[] arr,int n){
        int e=1;
        int o=0;
        while (true){
            while (e<n&& arr[e]%2==1)
                e+=2;
            while (o<n && arr[o]%2==0)
                o+=2;
            if(e<n && o<n){
                long temp=arr[e];
                arr[e]=arr[o];
                arr[o]=temp;
            }
            else
                break;
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        long[] arr=new long[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextLong();
        }
        arrange(arr,n);
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=(arr[i]+(i+1))%2;
        }
        System.out.println(sum);
    }
}
