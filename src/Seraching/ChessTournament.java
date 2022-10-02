package Seraching;

import java.util.Arrays;

public class ChessTournament {
    //question statement on coding ninja interview question of salesfroce..
    public static int chessTournament(int[] pos,int n,int players){
        Arrays.sort(pos);
        int l=1;
        int h=pos[n-1];
        int ans=0;
        while (l<=h){
            int mid=(l+h)/2;
            if (isPossible(pos,n,players,mid)){
                ans=mid;
                l=mid+1;
            }
            else
                h=mid-1;
        }
        return ans;
    }
    public static boolean isPossible(int[] pos,int n,int players,int curr){
        int last=pos[0];
        int count=1;
        for (int i=1;i<n;i++){
            if (pos[i]-last>=curr){
                count++;
                last=pos[i];
            }
        }
        return count>=players;
    }
    public static void main(String[] args) {
        int[] pos={1,2,3,4,5,6};
        int players=3;
        System.out.println(chessTournament(pos,pos.length,3));
    }
}
