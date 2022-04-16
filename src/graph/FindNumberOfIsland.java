package graph;

public class FindNumberOfIsland {
    /*
    Given a grid consisting of '0's(Water) and '1's(Land). Find the number of islands.
    Note: An island is surrounded by water and is formed by connecting adjacent lands horizontally or vertically or diagonally i.e., in all 8 directions.
     */
    public static int numIslands(char[][] grid) {
        int ans=0;
        int n=grid.length;
        int m=grid[0].length;
        for (int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]=='1'){
                    dfs(grid,n,m,i,j);
                    ans++;
                }
            }
        }
        return ans;
    }
    public static void dfs(char[][] grid,int n,int m ,int i,int j){
        if(i>=0 &&j>=0 &&i<n && j<m && grid[i][j]=='1'){
            grid[i][j]='0';
            dfs(grid,n,m,i,j+1);
            dfs(grid,n,m,i,j-1);
            dfs(grid,n,m,i-1,j);
            dfs(grid,n,m,i+1,j);
            dfs(grid,n,m,i+1,j+1);
            dfs(grid,n,m,i+1,j-1);
            dfs(grid,n,m,i-1,j-1);
            dfs(grid,n,m,i-1,j+1);
        }
    }
    public static void main(String[] args) {
        char[][] grid={{'0','1','1','1','0','0','0'},{'0','0','1','1','0','1','0'}};
        System.out.println(numIslands(grid));
    }
}
