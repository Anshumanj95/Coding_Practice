package BackTrack;

public class NQueenProblem {
    static boolean[][] board;
    static int n;
    public static boolean solve(){
        board=new boolean[n][n];
        if(!solveRec(0)) {
            System.out.println("no solution");
            return false;
        }
        printboard(board);
        return true;
    }
    public static boolean solveRec(int col){
        if(col==n)
            return true;
        for(int i=0;i<n;i++){
            if(isSafe(i,col)){
                board[i][col]=true;
                if(solveRec(col+1))
                    return true;
                //backtrack
                board[i][col]=false;
            }
        }
        return false;
    }
    public static boolean isSafe(int row,int col){
        //check  queen in backward direction
        for(int i=0;i<col;i++){
            if (board[row][i])
                return false;
        }
        //check queen for upper diagonal
        for(int i=row,j=col;i>=0&&j>=0;i--,j--){
            if (board[i][j])
                return false;
        }
        //check for lower diagonal
        for(int i=row,j=col;j>=0 && i<n;i++,j--)
            if(board[i][j])
                return false;
        return true;
    }
    public static void printboard(boolean[][] board){
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(board[i][j]){
                    System.out.print(" Q ");
                }
                else
                    System.out.print(" 0 ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        n=4;
        System.out.println(solve());

    }
}
