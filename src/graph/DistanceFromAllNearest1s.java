package graph;

import java.util.LinkedList;
import java.util.Queue;

public class DistanceFromAllNearest1s {
    class Pair{
        int i;
        int j;
        Pair(int i,int j)
        {
            this.i=i;
            this.j=j;
        }
    }
    public boolean isValid(int i,int j,int rows,int cols)
    {
        if(i<0||j<0||i>rows-1||j>cols-1)
            return false;
        else
            return true;
    }
    public int[][] nearest(int[][] grid)
    {
        int rows=grid.length;
        int cols=grid[0].length;
        Queue<Pair> q=new LinkedList<>();
        Queue<Pair> q2=new LinkedList<>();
        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<cols;j++)
            {
                if(grid[i][j]==1)
                {q.add(new Pair(i,j));
                    q2.add(new Pair(i,j));}
            }
        }
        q.add(null);
        boolean flag=true;;
        while(!q.isEmpty())
        {
            while(q.peek()!=null)//first wave with all starting points
            {
                Pair p=q.poll();
                int i=p.i;
                int j=p.j;
                if(isValid(i,j-1,rows,cols)&&grid[i][j-1]==0)//sirf 1's ko 2 bnakr add
                {
                    if(flag)
                        grid[i][j-1]=grid[i][j];
                    else
                        grid[i][j-1]=grid[i][j]+1;
                    q.add(new Pair(i,j-1));
                }
                if(isValid(i,j+1,rows,cols)&&grid[i][j+1]==0)
                {
                    if(flag)
                        grid[i][j+1]=grid[i][j];
                    else
                        grid[i][j+1]=grid[i][j]+1;
                    q.add(new Pair(i,j+1));
                }
                if(isValid(i-1,j,rows,cols)&&grid[i-1][j]==0)
                {
                    if(flag)
                        grid[i-1][j]=grid[i][j];
                    else
                        grid[i-1][j]=grid[i][j]+1;
                    q.add(new Pair(i-1,j));
                }
                if(isValid(i+1,j,rows,cols)&&grid[i+1][j]==0)
                {
                    if(flag)
                        grid[i+1][j]=grid[i][j];
                    else
                        grid[i+1][j]=grid[i][j]+1;
                    q.add(new Pair(i+1,j));
                }
            }
            flag=false;
            q.poll();
            if(!q.isEmpty())
                q.add(null);
        }
        while(!q2.isEmpty())
        {
            Pair p=q2.poll();
            int i=p.i;
            int j=p.j;
            grid[i][j]=0;
        }
        return grid;
    }
    public static void main(String[] args) {

    }
}
