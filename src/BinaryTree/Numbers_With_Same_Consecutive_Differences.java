package BinaryTree;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Numbers_With_Same_Consecutive_Differences {
    public static int[] numSameConsDiff(int n,int k){
        List<Integer> currList= Arrays.asList(1,2,3,4,5,6,7,8,9);
        for(int i=2;i<=n;i++){
            List<Integer> nextList=new ArrayList<>();
            for (int x:currList){
                int y=x%10;
                if (y+k<10)
                    nextList.add(x*10+y+k);
                if (k>0 && y-k>=0)
                    nextList.add(x*10+y-k);
            }
            currList=nextList;
        }
        return currList.stream().mapToInt(i->i).toArray();
    }
    public static void main(String[] args) {
        int n=3;
        int k=7;
        System.out.println(Arrays.toString(numSameConsDiff(n,k)));
    }
}
