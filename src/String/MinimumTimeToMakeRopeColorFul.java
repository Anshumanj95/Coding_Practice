package String;

public class MinimumTimeToMakeRopeColorFul {
    //leetcode 1578
    public static int minimumTime(int[] neededTime,String colors){
        int ans=0;
        int currMax=0;
        for (int i=0;i<colors.length();i++){
            if(i>0 && colors.charAt(i)!=colors.charAt(i-1))
                currMax=0;
            ans+=Math.min(currMax,neededTime[i]);
            currMax=Math.max(currMax,neededTime[i]);
        }
        return ans;
    }
    public static void main(String[] args) {
        String color="aaabbbabbbb";
        int[] neededTime={3,5,10,7,5,3,5,5,4,8,1};
        System.out.println(minimumTime(neededTime,color));
    }
}
