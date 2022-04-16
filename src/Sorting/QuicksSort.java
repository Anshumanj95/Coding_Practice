package Sorting;

public class QuicksSort {
    public static void printArray(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void swap(int[] arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    public static int lomutoPartition(int[] arr,int low,int high){
        // int this partition we use arr[high] as pivot element and it give back index of correct position of pivot element to be in sorted array
        //means all element smaller than pivot is on left side and greater element on right of it and pivot is in between them
        // according to study hoare partition method is best than both
        //if we want use random pivot element we simply pick random index in low to high then swap arr[p] with arr[low] for hoare and arr[p] with arr[high] in lomuto partition
        // choose random pivot is best getting rid of worst case occur in quicksort
        //the best case is when arr in divide in equal parts every time in recursion tree and time complexity is (nlogn)
        // the worst case is when arr is divide in one element in one side and other on other side in every recursion tree time taken is O(n*n)
        // t(n)=2t(n/2)+theta(n) in best case
        // t(n)=t(n-1)+theta(n) is worst case
        int pivot=arr[high];
        int i=low-1;
        for(int j=low;j<high;j++){
            if(arr[j]<pivot){
                i++;
                swap(arr,i,j);
            }
        }
        swap(arr,i+1,high);
        return (i+1);
    }
    public static int HoarePartition(int[] arr,int low,int high){
        //hoare partition method int this we use arr[low] as pivot and take to pointer i as low-1 and j as high+1
        // its ensure that all element on left side are smaller and all element are on right are greater than pivot but pivot element is not as its correct position
        // we return value at where greater elements are start
     int pivot=arr[low];
     int i=low-1;
     int j=high+1;
     while(true){
         do{
             i++;
         }while(arr[i]<pivot);
         do{
             j--;
         }while(arr[j]>pivot);
         if(i>=j) return j;
         swap(arr,i,j);
     }

    }
    public static void HoareQuicksort(int[] arr,int low,int high){

        if(low<high) {
            int partitionIndex = HoarePartition(arr, low, high);
            HoareQuicksort(arr, low, partitionIndex);
            HoarePartition(arr, partitionIndex + 1, high);
        }
    }
    public static void LomutoQuickSort(int[] arr,int low,int high){
        if(low<high){
            int partitionIndex=lomutoPartition(arr,low,high);
            LomutoQuickSort(arr,low,partitionIndex-1);
            LomutoQuickSort(arr,partitionIndex+1,high);
        }
    }

    public static void main(String[] args) {
      int[] arr={10, 80, 30, 90, 40, 50, 70};
        int n=arr.length;
        printArray(arr);
        HoarePartition(arr,0,n-1);
        printArray(arr);
        int[] arr2={5,3,1,8,6,45,90,76};
        printArray(arr2);
        LomutoQuickSort(arr2,0,arr2.length-1);
        printArray(arr2);
    }
}
