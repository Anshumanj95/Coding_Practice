package Sorting;

import java.util.Arrays;

public class CycleSort {
    //for minimum swaps just add swaps++ in swap function in while condition
    public static void SortDistinct(int[] arr){
        int n=arr.length;
        for(int cs=0;cs<n-1;cs++){
            int item=arr[cs];
            int pos=cs;
            for(int i=cs+1;i<n;i++){
                if(arr[i]<item)
                    pos++;
            }
            int temp=item;
            item=arr[pos];
            arr[pos]=temp;
            while (cs!=pos){
                pos=cs;
                for (int i=cs+1;i<n;i++){
                    if(arr[i]<item)
                        pos++;
                }
                temp=item;
                item=arr[pos];
                arr[pos]=temp;
            }
        }
    }
    public static void SortDuplicates(int[] arr){
        int n=arr.length;
        for(int cs=0;cs<n-1;cs++){
            int item=arr[cs];
            int pos=cs;
            for(int i=cs+1;i<n;i++){
                if(arr[i]<item)
                    pos++;
            }
            if(pos==cs)
                continue;
            while(item==arr[pos])
                pos++;
            if(pos!=cs){
                int temp=item;
                item=arr[pos];
                arr[pos]=temp;
            }
            while(pos!=cs){
                pos=cs;
                for(int i=cs+1;i<n;i++) {
                    if (arr[i] < item)
                        pos++;
                }
                while (item==arr[pos])
                    pos++;
                if(item!=arr[pos]){
                    int temp=item;
                    item=arr[pos];
                    arr[pos]=temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arr={20,10,40,30,50};
        SortDistinct(arr);
        System.out.println(Arrays.toString(arr));
        int[] arr2={20,10,10,20,80,90,40,30};
        SortDuplicates(arr2);
        System.out.println(Arrays.toString(arr2));

    }
}
