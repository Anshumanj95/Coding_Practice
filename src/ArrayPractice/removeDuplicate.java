package ArrayPractice;

import java.util.ArrayList;

public class removeDuplicate {
    public static ArrayList<Integer> remove(int[] arr){
        ArrayList<Integer> ans=new ArrayList<>();
        int n=arr.length;
        ans.add(arr[0]);
        for(int i=1;i<n;i++){
            if(arr[i-1]!=arr[i])
                ans.add(arr[i]);
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr={1,1,1,1,1,2,2,2,2,6,6,6,6};
        System.out.println(remove(arr));
    }
}
