package ArrayPractice;

public class LeftRotate {
    public static void leftRotateByOne(int[] arr){
        int n=arr.length;
        int temp=arr[0];
        for (int i=1;i<n;i++){
            arr[i-1]=arr[i];
        }
        arr[n-1]=temp;
    }
    //leftrotate by D
    public static void leftRotateByD(int[] arr,int d){
        int n=arr.length;
        int[] temp=new int[d];
        for(int i=0;i<d;i++)
            temp[i]=arr[i];
        for(int i=d;i<n;i++){
            arr[i-d]=arr[i];
        }
        for(int i=0;i<d;i++){
            arr[n-d+i]=temp[i];
        }
    }
    //reversal method
    public static void rotate(int[] arr,int d){
        int n=arr.length;
        reverse(arr,0,d-1);
        reverse(arr,d,n-1);
        reverse(arr,0,n-1);
    }
    public static void reverse(int[] arr,int low,int high){
        while (low<high){
            int temp=arr[low];
            arr[low]=arr[high];
            arr[high]=temp;
            low++;
            high--;
        }
    }
    public static void print(int[] arr){
        for(int e:arr){
            System.out.print(e+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        rotate(arr,2);
        print(arr);

    }
}
