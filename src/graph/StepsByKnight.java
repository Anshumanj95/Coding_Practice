package graph;

import java.util.LinkedList;
import java.util.Queue;
/*
Given a square chessboard, the initial position of Knight and position of a target. Find out the minimum steps a Knight will take to reach the target position.

Note:
The initial and the target position co-ordinates of Knight have been given accoring to 1-base indexing.


 */

public class StepsByKnight {
    static class Node {
        int i;
        int j;
        int steps;

        Node (int i, int j, int steps) {
            this.i = i;
            this.j = j;
            this.steps = steps;
        }
    }
    //Function to find out minimum steps Knight needs to reach target position.
    public static int minStepToReachTarget(int[] KnightPos, int[] TargetPos, int N)
    {
        // Code here
        boolean[][] visited = new boolean[N][N];
        int Ti, Tj;
        Ti = TargetPos[0] - 1;
        Tj = TargetPos[1] - 1;
        int Ki, Kj;
        Ki = KnightPos[0] - 1;
        Kj = KnightPos[1] - 1;
        Queue<Node> queue = new LinkedList<>();
        queue.add(new Node(Ki, Kj, 0));
        int[] rowIndexes = { -2, -1, 1, 2, 2, 1, -1, -2 };
        int[] colIndexes = { 1, 2, 2, 1, -1, -2, -2, -1};
        while (!queue.isEmpty()) {
            Node node = queue.remove();
            if (visited[node.i][node.j]) {
                continue;
            }
            if (node.i == Ti && node.j == Tj) {
                return node.steps;
            }
            visited[node.i][node.j] = true;
            for (int i = 0; i < 8; i++) {
                int r = node.i + rowIndexes[i];
                int c = node.j + colIndexes[i];
                if (r < 0 || r >= N || c < 0 || c >= N) {
                    continue;
                }
                queue.add(new Node(r, c, node.steps + 1));
            }
        }
        return -1 ;
    }
    public static void main(String[] args) {
        int n=6;
        int[] knight={4,5};
        int[] target={1,1};
        System.out.println(minStepToReachTarget(knight,target,n));

    }
}
