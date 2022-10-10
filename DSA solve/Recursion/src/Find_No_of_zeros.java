public class Find_No_of_zeros {
    public static void main(String[] args) {
        int n = 3040200;
        int count = 0;
        System.out.println(findNoOfZeros(n, count));
    }
    public  static int findNoOfZeros(int n, int count){
        if(n == 0) {
            return count;
        }
        if(n % 10 == 0){
            return  findNoOfZeros(n/10, count + 1);
        }
        return findNoOfZeros(n/10, count);
    }
}
