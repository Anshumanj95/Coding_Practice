package ArrayPractice;

import java.util.ArrayList;

public class NextPermutation {
    public static ArrayList<Integer> permute(int[] arr,int n){
        boolean flag=false;
        for (int i=n-2;i>=0;i--){
            if (arr[i]<arr[i+1]){
                for (int j=n-1;j>=i;j--){
                    if (arr[j]>arr[i]){
                        int temp=arr[j];
                        arr[j]=arr[i];
                        arr[i]=temp;
                        reverse(arr,i+1,n-1);
                        flag=true;
                        break;
                    }
                }
            }
            if (flag)
                break;
        }
        if (!flag)
            reverse(arr,0,n-1);
        ArrayList<Integer> ans=new ArrayList<>();
        for (int a:arr)
            ans.add(a);
        return ans;
    }
    public static void reverse(int[] arr,int st,int end){
       while(st<end){
            int temp=arr[st];
            arr[st]=arr[end];
            arr[end]=temp;
            st++;
            end--;
        }
    }
    public static void main(String[] args) {

    }
}
