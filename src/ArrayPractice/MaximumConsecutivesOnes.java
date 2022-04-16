package ArrayPractice;

public class MaximumConsecutivesOnes {
    public static int ConsecutiveOne(int[] arr){
        int n=arr.length;
        int curr=0;
        int res=0;
        for(int i=0;i<n;i++){
            if(arr[i]==0)
                curr=0;
            else{
                curr++;
                res=Math.max(curr,res);
            }
        }
        return res;
    }
    public static void main(String[] args) {
        int[] arr={1,0,1,1,1,0,0,0};
        System.out.println(ConsecutiveOne(arr));

    }
}
