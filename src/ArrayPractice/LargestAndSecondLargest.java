package ArrayPractice;

import java.util.ArrayList;

public class LargestAndSecondLargest {
    public static ArrayList<Integer> find(int[] arr){
        int n=arr.length;
        int max=arr[0];
        int max2=-1;
        for(int i=1;i<n;i++){
            if(arr[i]>max){
                max2=max;
                max=arr[i];
            }
            else if(arr[i]!=max){
                if(max2==-1||arr[i]>max2)
                    max2=arr[i];
            }
        }
        ArrayList<Integer> ans=new ArrayList<>();
        ans.add(max);
        ans.add(max2);
        return ans;
    }
    public static void main(String[] args) {
        int[] arr={10};
        System.out.println(find(arr));
    }
}
