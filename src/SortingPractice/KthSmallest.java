package SortingPractice;

public class KthSmallest {
    public static int kthSmallest(int[] arr, int n, int k)
    {
        // Your code here
        int low=0;
        int high=n-1;
        while(low<=high){
            int p=partition(arr,low,high);
            if(p==k-1)
                return arr[p];
            else if(p>k-1){
                high=p-1;
            }
            else{
                low=p+1;
            }
        }
        return -1;
    }
    public static int partition(int[] arr,int l,int h){
        int pivot=arr[h];
        int i=l-1;
        for(int j=l;j<=h;j++){
            if(arr[j]<pivot){
                i++;
                swap(arr,i,j);
            }
        }
        swap(arr,i+1,h);
        return (i+1);
    }
    public static void swap(int[] arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    public static void main(String[] args) {
        int[] arr={3,4,6,9,8};
       // System.out.println(kthSmallest(arr,arr.length,2));
        System.out.println(6%7);

    }
}
