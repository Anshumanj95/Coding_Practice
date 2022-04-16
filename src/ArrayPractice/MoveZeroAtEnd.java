package ArrayPractice;

public class MoveZeroAtEnd {
    public static void move(int[] arr){
        int n=arr.length;
        int count=0;
        for(int i=0;i<n;i++){
            if(arr[i]!=0){
                swap(arr,i,count);
                count++;
            }
        }
    }
    public static void swap(int[] arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;


    }
    public static void main(String[] args) {
        int[] arr={1,3,2,0,4,0,3};
        move(arr);
        for (int e:arr)
            System.out.print(e+" ");
    }
}
