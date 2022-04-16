package daa;

public class Question2 {
        public static void linearSearch(int[] arr,int size,int element) {
            boolean flag = false;
            for (int i = 0; i < size; i++) {
                if (arr[i] == element) {
                    flag = true;
                }
            }
            if (flag)
                System.out.println(element+" Element is found");
            else
                System.out.println("Element is not found");
        }

        public static int BinarySearch(int[] arr,int size,int element){
            int mid,low,high;
            low=0;
            high=size-1;
            while (low<=high) {
                mid=(low+high)/2;
                if (arr[mid] == element) {
                    return mid;
                }
                if (arr[mid] < element) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }
            return -1;
        }

    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,9};
        linearSearch(arr,arr.length,4);//O(n)
        System.out.println(BinarySearch(arr,arr.length,4));//O(logn)
    }
}
