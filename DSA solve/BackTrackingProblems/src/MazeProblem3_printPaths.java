public class MazeProblem3_printPaths {
    public static void main(String[] args) {
        int[][] a = new int[3][3];
        int currRow = 0;
        int currCol = 0;
        int rowSize = a.length;
        int colSize = a[0].length;
        String processed = "";
        findPaths(processed, a, currRow, currCol, rowSize, colSize);
    }
    public static void findPaths(String processed, int[][] a, int row, int col, int n, int m){
        if(row == n-1 && col == m-1){
            System.out.println(processed);
            return ;
        }
        if(row < n) {
            findPaths(processed + "D", a, row + 1, col, n, m);
        }
        if(col < m) {
            findPaths(processed + "R", a, row, col + 1, n, m );
        }
    }
}
