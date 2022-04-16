package graph;

public class WhetherPathExists {
    /*
    Given a grid of size n*n filled with 0, 1, 2, 3. Check whether there is a path possible from the source to destination. You can traverse up, down, right and left.
The description of cells is as follows:

A value of cell 1 means Source.
A value of cell 2 means Destination.
A value of cell 3 means Blank cell.
A value of cell 0 means Wall.
     */
    public static boolean isPossible(int[][] grid){
        int r=grid.length;
        int c=grid[0].length;
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(grid[i][j]==1){
                    if(dfs(i,j,r,c,grid))
                        return true;
                }
            }
        }
        return false;
    }
    public static boolean dfs(int i,int j,int r,int c,int[][] grid){
        if(i<0||i>r-1||j<0||j>c-1)
            return false;
        if(grid[i][j]==0)
            return false;
        if(grid[i][j]==2)
            return true;
        grid[i][j]=0;
        boolean a=dfs(i-1,j,r,c,grid);
        boolean b=dfs(i+1,j,r,c,grid);
        boolean e=dfs(i,j-1,r,c,grid);
        boolean d=dfs(i,j+1,r,c,grid);
        return (a||b||e||d);
    }
    public static void main(String[] args) {
        int[][] grid1= {{3,0,3,0,0},{3,0,0,0,3}
                ,{3,3,3,3,3},{0,2,3,0,0},{3,0,0,1,3}};
        int[][] grid2= {{1,3},{3,2}};
        System.out.println(isPossible(grid1));
        System.out.println(isPossible(grid2));
    }
}
