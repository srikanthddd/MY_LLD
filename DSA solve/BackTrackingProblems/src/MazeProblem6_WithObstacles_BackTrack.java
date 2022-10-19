import java.util.ArrayList;


// In this problem, you can move in 4 directions.
public class MazeProblem6_WithObstacles_BackTrack {
    public static void main(String[] args) {
        int[][] maze = {
                {1,1,1},
                {1,1,1},
                {1,1,1}
        };
        int currRow = 0;
        int currCol = 0;
        int rowSize = maze.length;
        int colSize = maze[0].length;
        String processed = "";
        System.out.println(findPaths(processed, maze, currRow, currCol, rowSize, colSize));
    }
    public static ArrayList<String> findPaths(String processed, int[][] a, int row, int col, int n, int m){
        if(row == n-1 && col == m-1){
            ArrayList<String> path = new ArrayList<>();
            path.add(processed);
            return path;
        }
        ArrayList<String> allPaths = new ArrayList<>();

        if(row == n || col == m || a[row][col]==0){
            return allPaths;
        }

        a[row][col] = 0; // Considering this block so, making it as visited already.

        if(row < n) {
            allPaths.addAll(findPaths(processed + "D", a, row + 1, col, n, m));  // Horizantal
        }
        if(col < m) {
            allPaths.addAll(findPaths(processed + "R", a, row, col + 1, n, m )); //Vertical
        }

        if(row > 0) {
            allPaths.addAll(findPaths(processed + "U", a, row - 1, col, n, m));  // Horizantal
        }
        if(col > 0) {
            allPaths.addAll(findPaths(processed + "L", a, row, col - 1, n, m )); //Vertical
        }


        a[row][col] = 1; //Reverting this for backtracking.


        return allPaths;
    }
}
