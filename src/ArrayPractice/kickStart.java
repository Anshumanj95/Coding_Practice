package ArrayPractice;

import java.util.Scanner;

public class kickStart {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int ans=2;
        int pd=arr[1]-arr[0];
        int curr=2;
        for(int j=2;j<n;j++){
            if(pd==arr[j]-arr[j-1]){
                curr++;
            }
            else{
                pd=arr[j]-arr[j-1];
                curr=2;
            }
            ans=Math.max(ans,curr);
        }
        System.out.println(ans);
    }
}
