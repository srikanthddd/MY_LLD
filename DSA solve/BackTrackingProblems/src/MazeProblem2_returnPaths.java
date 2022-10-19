import java.util.ArrayList;

public class MazeProblem2_returnPaths {
    public static void main(String[] args) {
        int[][] a = new int[3][3];
        int currRow = 0;
        int currCol = 0;
        int rowSize = a.length;
        int colSize = a[0].length;
        String processed = "";
        System.out.println(findPaths(processed, a, currRow, currCol, rowSize, colSize));
    }
    public static ArrayList<String> findPaths(String processed, int[][] a, int row, int col, int n, int m){
        if(row == n-1 && col == m-1){
            ArrayList<String> path = new ArrayList<>();
            path.add(processed);
            return path;
        }
        ArrayList<String> allPaths = new ArrayList<>();
        if(row < n) {
            allPaths.addAll(findPaths(processed + "D", a, row + 1, col, n, m));
        }
        if(col < m) {
            allPaths.addAll(findPaths(processed + "R", a, row, col + 1, n, m ));
        }
        return allPaths;
    }
}
