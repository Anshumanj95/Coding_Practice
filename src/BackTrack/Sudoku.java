package BackTrack;

public class Sudoku {
    public static boolean solve(int[][] grid,int N){
        int row=-1;
        int col=-1;
        boolean isEmpty=true;
        for(int i=0;i<N;i++){
            for(int j=0;j<N;j++){
                if(grid[i][j]==0){
                    row=i;
                    col=j;
                    isEmpty=false;
                    break;
                }
            }
            if(!isEmpty)
                break;
        }
        if(isEmpty)
            return true;
        for(int n=1;n<=N;n++){
            if(isSafe(row,col,n,grid,N)){
                grid[row][col]=n;
                if(solve(grid, N))
                    return true;
                else
                    grid[row][col]=0;
            }
        }
        return false;
    }
    public static boolean isSafe(int i,int j,int n,int[][] grid,int N){
        for(int k=0;k<N;k++){
            if(grid[i][k]==n||grid[k][j]==n)
                return false;
        }
        int s=(int)Math.sqrt(N);
        int rs=i-i%s;
        int cs=j-j%s;
        for(int k=0;k<s;k++){
            for(int l=0;l<s;l++){
                if(grid[k+rs][l+cs]==n)
                    return false;
            }
        }
        return true;
    }
    public static void printgrid(int[][] grid,int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(" "+grid[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int[][]grid = {
                { 3, 0, 6, 5, 0, 8, 4, 0, 0 },
                { 5, 2, 0, 0, 0, 0, 0, 0, 0 },
                { 0, 8, 7, 0, 0, 0, 0, 3, 1 },
                { 0, 0, 3, 0, 1, 0, 0, 8, 0 },
                { 9, 0, 0, 8, 6, 3, 0, 0, 5 },
                { 0, 5, 0, 0, 9, 0, 6, 0, 0 },
                { 1, 3, 0, 0, 0, 0, 2, 5, 0 },
                { 0, 0, 0, 0, 0, 0, 0, 7, 4 },
                { 0, 0, 5, 2, 0, 6, 3, 0, 0 }
        };
        int N=grid.length;
        System.out.println(solve(grid,N));
        printgrid(grid,N);
    }
}
