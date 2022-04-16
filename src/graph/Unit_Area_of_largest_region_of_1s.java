package graph;

public class Unit_Area_of_largest_region_of_1s {
    /*
    Given a grid of dimension nxm containing 0s and 1s. Find the unit area of the largest region of 1s.
Region of 1's is a group of 1's connected 8-directionally (horizontally, vertically, diagonally).
     */
    public static int findMax(int[][] grid){
        int n=grid.length;
        int m=grid[0].length;
        int max=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]==1){
                    max=Math.max(max,dfs(i,j,n,m,grid));
                }
            }
        }
        return max;
    }
    public static int dfs(int i,int j,int n,int m,int[][] grid){
        if(i<0||j<0||i>=n||j>=m||grid[i][j]==0)
            return 0;
        grid[i][j]=0;
        return 1+dfs(i,j-1,n,m,grid)+dfs(i,j+1,n,m,grid)+dfs(i-1,j,m,n,grid)+dfs(i+1,j,m,n,grid)+
                dfs(i-1,j-1,n,m,grid)+dfs(i-1,j+1,n,m,grid)+dfs(i+1,j-1,n,m,grid)+
                dfs(i+1,j+1,n,m,grid);
    }
    public static void main(String[] args) {
        int[][] grid={{1,1,1,1,0},{0,0,0,1,0},{0,0,0,0,1}};
        System.out.println(findMax(grid));

    }
}
