package Seraching;

public class MedianOfTwoSortedArray {
    //this solution is of O(log n) and uses binary search without using extra space and one assumption is there size of arr1 is always smaller than of equal to size of arr2
    // for recall this plz see tutorial again
    public static double median(int[] arr1,int[] arr2,int n1,int n2){
        int begin=0;
        int end=n1;
        while(begin<=end){
            int i1=(begin+end)/2;
            int i2=((n1+n2+1)/2)-i1;
            int min1=(i1==n1)?Integer.MAX_VALUE:arr1[i1];//minimum value of right side of arr1
            int max1=(i1==0)?Integer.MIN_VALUE:arr1[i1-1];//maximum value of left side of arr1
            int min2=(i2==n2)?Integer.MAX_VALUE:arr2[i2];//minimum value of right side of arr2
            int max2=(i2==0)?Integer.MIN_VALUE:arr2[i2-1];//maximum value of left side of arr2
            if(max1<=min2 && max2<=min1){
                if ((n1+n2)%2==0)
                    return (double) ((Math.max(max1,max2)+Math.min(min1,min2))/2);
                else
                    return (double) Math.max(max1,max2);
            }
            else if(max1>min2)
                end=i1-1;
            else
                begin=i1+1;
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr1={1,2,3,4};
        int[] arr2={5,6,7,8,9,10};
        System.out.println(median(arr1,arr2,arr1.length,arr2.length));
    }
}
