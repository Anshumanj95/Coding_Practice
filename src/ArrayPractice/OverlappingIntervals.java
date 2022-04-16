package ArrayPractice;

import java.util.ArrayList;
import java.util.Arrays;

public class OverlappingIntervals {
    public static int[][] overlap(int[][] arr){
        Arrays.sort(arr,(a,b)->{return a[0]-b[0];});
        ArrayList<Integer> ar=new ArrayList<>();
        int s=arr[0][0];
        int e=arr[0][1];
        for(int i=0;i<arr.length;i++){
            if(e<arr[i][0]){
                ar.add(s);
                ar.add(e);
                s=arr[i][0];
                e=arr[i][1];
            }
            else{
                e=Math.max(e,arr[i][1]);
            }
        }
        ar.add(s);
        ar.add(e);
        int[][] res=new int[ar.size()/2][2];
        int c=0;
        for(int i=0;i<ar.size();i+=2){
            res[c][0]=ar.get(i);
            res[c][1]=ar.get(i+1);
            c++;
        }
        return res;

    }
    public static void main(String[] args) {
        int[][] arr={{1,3},{2,4},{6,8},{9,10}};
        int[][] ans=overlap(arr);
        for(int i=0;i<ans.length;i++){
            for (int j=0;j<ans[0].length;j++){
                System.out.print(ans[i][j]+" ");
            }

        }
    }
}
