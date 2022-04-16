package ArrayPractice;

public class equbrilliumPoint {
    public static int point(int[] arr){
        int n= arr.length;
        int sum=0;
        int leftSum=0;
        for(int i=0;i<n;i++)
            sum+=arr[i];
        for(int i=0;i<n;i++){
            sum-=arr[i];
            if(sum==leftSum)
                return (i+1);
            leftSum+=arr[i];
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr={1,3,5,2,2};
        System.out.println(point(arr));

    }
}
