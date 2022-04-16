package ArrayPractice;

public class reverseArray {
    public static void reverse(int[] arr){
//        int n=arr.length;
//        int low=0;
//        int high=n-1;
//        while(low<high){
//            int temp=arr[low];
//            arr[low]=arr[high];
//            arr[high]=temp;
//            low++;
//            high--;
//        }
        for(int i=0;i<arr.length/2;i++){
            int temp=arr[i];
            arr[i]=arr[arr.length-1-i];
            arr[arr.length-1-i]=temp;
        }
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        reverse(arr);
        for(int e:arr)
            System.out.print(e+" ");
    }
}
