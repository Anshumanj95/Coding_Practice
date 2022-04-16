package Heap;

import java.util.PriorityQueue;

public class Kth_element_inMatrix {
    static class pair{
        int x,y,val;
        public pair(int val,int x,int y){
            this.x=x;
            this.y=y;
            this.val=val;
        }
    }
    public static int KthSmallest(int[][] mat,int n,int k){
        if(k==1)
            return mat[0][0];
        if(k==(n*n))
            return mat[n-1][n-1];
        PriorityQueue<pair> pq=new PriorityQueue<>((p1,p2)->p1.val- p2.val);
        for (int i=0;i<n;i++)
            pq.add(new pair(mat[i][0],i,0));
        pair temp=pq.peek();
        while (k>0){
            temp=pq.poll();
            k--;
            int x=temp.x;
            int y=temp.y;
            y+=1;
            if(x<n&& y<n)
                pq.add(new pair(mat[x][y],x,y));

        }
        return temp.val;
    }
    public static void main(String[] args) {
        int[][] mat={{10,20,30,40},{15,25,35,45},{24,29,37,48},{32,33,39,50}};
        System.out.println(KthSmallest(mat,mat.length,3));

    }
}
