package BackTrack;
/*
A Maze is given as N*N matrix of blocks where source block is the upper left most block i.e., maze[0][0] and destination block is lower rightmost block i.e., maze[N-1][N-1]. Find the minimum number of Hops required for the rat to reach from the source block to the destination block. The number of steps rat can jump from (i, j) is represented by maze[i][j].

Note:
If multiple solutions exist, the shortest earliest hop will be accepted. For the same hop distance at any point, forward will be preferred over downward.
In the maze matrix, 0 means the block is the dead end and non-zero number means the block can be used in the path from source to destination. The non-zero value of mat[i][j] indicates number of maximum jumps rat can make from cell mat[i][j].
 */
public class RatMazeWithMultipleJumps {
    public static void solve(int[][] maze,int n){
        int[][] sol=new int[n][n];
        if(solveRec(maze,n,0,0,sol))
            print(sol);
        else
        System.out.println(-1);
    }
    public static  boolean solveRec(int[][] maze,int n,int i,int j,int[][] sol){
        if(i==n-1 && j==n-1){
            sol[i][j]=1;
            return true;
        }
        if(isSafe(maze,i,j,n)){
            int jumps=maze[i][j];
            sol[i][j]=1;
            for(int k=1;k<=jumps;k++){
                //forward check
                if(solveRec(maze,n,i,j+k,sol))
                    return true;
                //backward check
                if(solveRec(maze,n,i+k,j,sol))
                    return true;
            }
            sol[i][j]=0;
        }
        return false;
    }
    public static boolean isSafe(int[][] maze,int i,int j,int n){
        return (i<n&&j<n&&maze[i][j]!=0);
    }

    public static void print(int[][] sol){
        for (int[] ints : sol) {
            for (int j = 0; j < sol[0].length; j++) {
                System.out.print(ints[j] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int[][] maze={{2,1,0,0},{3,0,0,1},
                {0,1,0,1},{0,0,0,1}};
        solve(maze, maze.length);

    }
}
