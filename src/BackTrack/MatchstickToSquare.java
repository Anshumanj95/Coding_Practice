package BackTrack;

import java.util.Arrays;

public class MatchstickToSquare {
    public static boolean isPossible(int[] arr){
        if (arr.length<4)
            return false;
        int total= Arrays.stream(arr).sum();
        if (total%4!=0)
            return false;
        int[] sides={total/4,total/4,total/4,total/4};
        Arrays.sort(arr);
        return helper(arr,arr.length-1,sides);
    }
    public static boolean helper(int[] arr,int i,int[] sides){
        if (i==-1){
            return sides[0]==0 && sides[1]==0 && sides[2]==0 && sides[3]==0;
        }
        for (int j=0;j<4;j++){
            if (arr[i]>sides[j])
                continue;
            sides[j]-=arr[i];
            if (helper(arr,i-1,sides))
                return true;
            sides[j]+=arr[i];
        }
        return false;
    }
    public static void main(String[] args) {
        int[] arr={3,3,3,3,4};
        System.out.println(isPossible(arr));
    }
}
