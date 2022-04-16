package daa;
import java.util.*;
public class Question1 {
    //Ω(N^2) in all cases
    public static void BubbleSort(int[] arr,int n){
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-1-i;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }
    //Ω(N^2) in all cases
    public static void InsertionSort(int[] arr,int n){
        int key,j;
        for (int i=1;i<n;i++){
            key=arr[i];
            j=i-1;
            while(j>=0 && arr[j]>key){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=key;
        }
    }
    //Ω(n log(n))	in all cases
    public static void Mergesort(int[] arr,int l,int r){
        if(l<r){
            int m=(l+r)/2;
            Mergesort(arr,0,m);
            Mergesort(arr,m+1,r);
            merge(arr,l,m,r);
        }
    }
    //(
    public static void merge(int[] arr,int l,int m,int r) {
        int n1 = m - l + 1;
        int n2 = r - m;
        int[] left = new int[n1];
        int[] right = new int[n2];
        for (int i = 0; i < n1; i++) {
            left[i] = arr[l + i];
        }
        for (int j = 0; j < n2; j++) {
            right[j] = arr[m + 1 + j];
        }
        int i = 0, j = 0, k = l;
        while (i < n1 && j < n2) {
            if (left[i]<=right[j]){
                arr[k]=left[i];
                k++;
                i++;
            }
            else{
                arr[k]=right[j];
                k++;
                j++;
            }
        }
        while(i<n1){
            arr[k]=left[i];
            i++;
            k++;
        }
        while(j<n2){
            arr[k]=right[j];
            j++;
            k++;
        }
    }
    public static void swap(int[] arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    public static int partition(int[] arr,int low,int high){
        int pivot=arr[high];
        int i=low-1;
        for(int j=low;j<=high-1;j++){
            if(arr[j]<pivot){
                i++;
                swap(arr,i,j);
            }
        }
        swap(arr,i+1,high);
        return (i+1);

    }
    //Ω(n log(n)) but O(n^2) in worst case
    public static void quicksort(int[] arr,int low,int high){
        int partitionIndex;
        if(low<high) {
            partitionIndex = partition(arr, low, high);
            quicksort(arr, low, partitionIndex - 1);
            quicksort(arr, partitionIndex + 1, high);

        }
    }
    //O(N^2) in all case
    public static void SelectionSort(int[] arr,int n){
        int indexofmin,temp;
        for(int i=0;i<n-1;i++){
            indexofmin=i;
            for(int j=i+1;j<n;j++){
                if(arr[j]<arr[indexofmin])
                    indexofmin=j;
            }
            temp=arr[i];
            arr[i]=arr[indexofmin];
            arr[indexofmin]=temp;
        }
    }
    //Ω(n+k) but o(n^2)in worst case
    public static void bucketSort(int[] arr, int bucketSize){
        List<Integer>[] buckets = new List[bucketSize];
        for(int i = 0; i < bucketSize; i++){
            buckets[i] = new LinkedList<>();
        }
        for(int num : arr){
            buckets[hash(num, bucketSize)].add(num);
        }
        for(List<Integer> bucket : buckets){
            Collections.sort(bucket);
        }

        int index = 0;
        for(List<Integer> bucket : buckets){
            for(int num : bucket){
                arr[index++] = num;
            }
        }
    }
    public static int hash(int num, int bucketSize){
        return num/bucketSize;
    }
    //o(n^2)
    public static void ShellSort(int[] arr)
    {
        int n = arr.length;
        for (int gap = n / 2; gap > 0; gap /= 2) {
            for (int i = gap; i < n; i += 1) {
                int temp = arr[i];
                int j;
                for (j = i; j >= gap && arr[j - gap] > temp; j -= gap)
                    arr[j] = arr[j - gap];
                arr[j] = temp;
            }
        }
    }
    public static int getMax(int[] arr, int n)
    {
        int mx = arr[0];
        for (int i = 1; i < n; i++)
            if (arr[i] > mx)
                mx = arr[i];
        return mx;
    }
    //O(n+k)
    public static void countSort(int[] arr, int n, int exp)
    {
        int[] output=new int[n];
        int i;
        int[] count=new int[10];
        for (i = 0; i < n; i++)
            count[(arr[i] / exp) % 10]++;
        for (i = 1; i < 10; i++)
            count[i] += count[i - 1];
        for (i = n - 1; i >= 0; i--) {
            output[count[(arr[i] / exp) % 10] - 1] = arr[i];
            count[(arr[i] / exp) % 10]--;
        }
        for (i = 0; i < n; i++)
            arr[i] = output[i];
    }
    //Ω(nk) in all cases
    public static void RadixSort(int arr[], int n) {
        int m = getMax(arr, n);
        for (int exp = 1; m / exp > 0; exp *= 10)
            countSort(arr, n, exp);
    }
    public static void print(int[] arr,int n)
    {
        for (int i=0;i<n; i++)
            System.out.print(arr[i]+" ");
        System.out.println();
    }
    //Ω(n log(n)) in all cases
    public static  void  HeapSort(int[] arr)
    {
        int n = arr.length;
        for (int i = n / 2 - 1; i >= 0; i--)
            heapify(arr, n, i);
        for (int i=n-1; i>=0; i--)
        {
            // Move current root to end
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            // call max heapify on the reduced heap
            heapify(arr, i, 0);
        }
    }
    public static void heapify(int[] arr, int n, int i)
    {
        int largest = i;
        int l = 2*i + 1;
        int r = 2*i + 2;
        if (l < n && arr[l] > arr[largest])
            largest = l;
        if (r < n && arr[r] > arr[largest])
            largest = r;
        if (largest != i)
        {
            int swap = arr[i];
            arr[i] = arr[largest];
            arr[largest] = swap;
            heapify(arr, n, largest);
        }
    }
    public static void main(String[] args) {
        int[] arr={1,4,6,3,2,5,8,3};
        int n=arr.length;
        System.out.println("Before Sorting");
        print(arr,n);
        InsertionSort(arr,n);
        System.out.println("After Insertion Sort");
        print(arr,n);
        SelectionSort(arr,n);
        System.out.println("After Selection Sort");
        print(arr,n);
        BubbleSort(arr,n);
        System.out.println("After Bubble Sort");
        print(arr,n);
        quicksort(arr,0,n-1);
        System.out.println("After Quick Sort");
        print(arr,n);
        Mergesort(arr,0,n-1);
        System.out.println("After Merge Sort");
        print(arr,n);
        bucketSort(arr,n);
        System.out.println("After Bucket Sort");
        print(arr,n);
        ShellSort(arr);
        System.out.println("After Shell Sort");
        print(arr,n);
        RadixSort(arr,n);
        System.out.println("After Radix Sort");
        print(arr,n);
        HeapSort(arr);
        System.out.println("After Heap Sort");
        print(arr,n);


    }
}
