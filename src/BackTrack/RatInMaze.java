package BackTrack;

public class RatInMaze {
    // a rat can move right or down and on 1 blocks only not blocked one
    static int n;
    public static boolean solveMaze(int[][] maze){
        int[][] sol=new int[n][n];
        if(!solveRec(maze,0,0,sol)) {
            System.out.println("No path");
            return false;
        }
        printsol(sol);
        return true;
    }
    public static boolean solveRec(int[][] maze,int i,int j,int[][] sol){
        if(i==n-1 && j==n-1 && maze[i][j]==1){
            sol[i][j]=1;
            return true;
        }
        if(isSafe(maze,i,j)){
            sol[i][j]=1;
            if(solveRec(maze,i+1,j,sol))
                return true;
            if(solveRec(maze,i,j+1,sol))
                return true;
            //backtrack
            sol[i][j]=0;
        }
        return false;
    }
    public static boolean isSafe(int[][] maze,int i,int j){
        return (i<n && j<n && maze[i][j]==1);
    }

    public static void printsol(int[][]sol){
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(" "+sol[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int[][] maze = { { 1, 0, 0, 0 },
                         { 1, 1, 0, 1 },
                         { 0, 1, 0, 0 },
                         { 1, 1, 1, 1 } };

        n = maze.length;
        System.out.println(solveMaze(maze));
    }
}
