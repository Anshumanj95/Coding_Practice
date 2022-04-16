package ArrayPractice;

public class MajorityElement {
    public static int MooreVoting(int[] arr){
        int n=arr.length;
        int count=1;
        int res=0;
        //find the index of majority element
        for(int i=1;i<n;i++){
            if(arr[res]==arr[i]){
                count++;
            }
            else
                count--;
            if(count==0){
                res=i;
                count=1;
            }
        }
        //check if it actually majority element or not
        count=0;
        for (int i=0;i<n;i++)
            if(arr[res]==arr[i])
                count++;
            if(count<=n/2)
                return -1;
            else return arr[res];
    }
    public static void main(String[] args) {
        int[] arr={8,8,6,6,6,8,8};
        System.out.println(MooreVoting(arr));

    }
}
