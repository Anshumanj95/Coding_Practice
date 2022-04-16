package Recursion;

public class ropeCutting {
    //time complexity is O(3^n) better solution of this is in dp
    public static int maxCuts(int n,int a,int b,int c){
        if(n==0)
            return 0;
        if(n<=-1)
            return -1;
        int res=Math.max(maxCuts(n-a,a,b,c),Math.max(maxCuts(n-b,a,b,c),maxCuts(n-c,a,b,c)));
        if(res==-1)
            return -1;
        return res+1;
    }
    public static void main(String[] args) {

    }
}
