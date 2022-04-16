package ArrayPractice;

import java.util.ArrayList;

public class ReaarngeArray {
    public static void reArrange(int[] arr){
        int n=arr.length;
        int max_ind=n-1;
        int min_ind=0;
        int max=arr[n-1]+1;
        for (int i=0;i<n;i++){
            if(i%2==0){
                arr[i]=(arr[max_ind]%max)*max+arr[i];
                max_ind--;
            }
            else{
                arr[i]=(arr[min_ind]%max)*max+arr[i];
                min_ind++;
            }
        }
        for (int i=0;i<n;i++)
            arr[i]=arr[i]/max;
    }
    public static void reArrange2(int[] arr){
        int i=0;
        int j=arr.length-1;
        ArrayList<Integer> ans=new ArrayList<>();
        while (i<=j){
            ans.add(arr[j--]);
            ans.add(arr[i++]);
        }
        for (int k=0;k< ans.size();k++){
            arr[k]=ans.get(k);
        }
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6};
        reArrange(arr);
        for(int e:arr)
            System.out.print(e+" ");
    }
}
