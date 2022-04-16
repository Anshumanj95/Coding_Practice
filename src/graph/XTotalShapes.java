package graph;

public class XTotalShapes {
    public static int countX(char[][] grid){
        int n=grid.length;
        int m=grid[0].length;
        int count=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]=='X'){
                    count++;
                    dfs(i,j,grid);
                }
            }
        }
        return count;
    }
    public static void dfs(int i,int j,char[][] grid){
        if(i<0||i>=grid.length||j<0||j>=grid[0].length||grid[i][j]=='O')
            return;
        grid[i][j]='O';
        dfs(i-1,j,grid);
        dfs(i+1,j,grid);
        dfs(i,j-1,grid);
        dfs(i,j+1,grid);
    }
    public static void main(String[] args) {
        char[][] grid = {{'X','O','X'},{'O','X','O'},{'X','X','X'}};
        System.out.println(countX(grid));

    }
}
