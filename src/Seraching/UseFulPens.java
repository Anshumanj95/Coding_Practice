package Seraching;

public class UseFulPens {
    //question coding ninja recycling pens
    public static int maxUsefulPens(int n,int r,int k,int c){
        int l=0;
        int h=n;
        int ans=0;
        while (l<=h){
            int m=l+(h-l)/2;
            if (canMake(n,r,k,c,m)){
                ans=m;
                l=m+1;
            }
            else
                h=m-1;
        }
        return ans;
    }
    public static boolean canMake(int n,int r,int k,int c,int m){
        int total_cost_after_recycle_pen=r+(n-m)*k;//(n-m) recycle pens
        int costOfRefileOf_remainingPens=m*c;
        return costOfRefileOf_remainingPens<=total_cost_after_recycle_pen;
    }
    public static void main(String[] args) {
        int n=15;
        int r=11;
        int k=3;
        int c=5;
        System.out.println(maxUsefulPens(n,r,k,c));

    }
}
