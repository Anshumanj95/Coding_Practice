package Seraching;

public class missing_in_ap {
    public static int findMissingTerm(int[] arr,int n){
        int d=0;
        //Since it is possible that my element at 1 index or n-2 index can be my ans.
        //so we check
        if(arr[1]-arr[0]!=arr[n-1]-arr[n-2])
            d=arr[2]-arr[1];
        else
            d=arr[1]-arr[0];
        int a=arr[0];
        int l=0,h=n-1;
        while (l<h){
            int mid=(l+h)/2;
            int curr=a+(mid)*d;
            if (curr==arr[mid])
                l=mid+1;
            else
                h=mid;
        }
        return a+(l)*d;
    }
    public static void main(String[] args) {
        int[] arr={5,10,20,25};
        System.out.println(findMissingTerm(arr,arr.length));
    }
}
