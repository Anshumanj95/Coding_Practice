package ArrayPractice;

public class ArrayPairSumDivisibility {
    public static boolean canPair(int[] arr,int k){
        int n=arr.length;
        if (n%2!=0)
            return false;
        int[] rem=new int[k];
        for (int i=0;i<n;i++)
            rem[arr[i]%k]++;
        if (rem[0]%2!=0)
            return false;
        for (int i=1;i<k;i++)
            if (rem[i]!=rem[k-i])
                return false;
        return true;
    }
    public static void main(String[] args) {
        int[] arr={5,7,9,6};
        System.out.println(canPair(arr,3));
    }
}
