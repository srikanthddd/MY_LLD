public class MazeProblem_countPaths {
    public static void main(String[] args) {
        int[][] a = new int[3][3];
        int currRow = 0;
        int currCol = 0;
        int rowSize = a.length;
        int colSize = a[0].length;
        System.out.println(countNoOfWaysToReachEnd(a, currRow, currCol, rowSize, colSize, 0));
    }
    public static int countNoOfWaysToReachEnd(int[][] a, int row, int col, int n, int m, int count){
        if(row == n-1 && col == m-1){
            count ++;
            return count;
        }
        if(row == n || col == m){
            return 0;
        }

        return countNoOfWaysToReachEnd(a, row+1, col, n, m , count) + countNoOfWaysToReachEnd(a, row, col + 1, n, m , count);
    }
}
