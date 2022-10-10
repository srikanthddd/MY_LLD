public class SumOf_N_Numbers  {
    public static void main(String[] args) {
        int n = 3;
        System.out.println(sumOfNNumbers(n));
    }
    public static int sumOfNNumbers(int n){
        if(n==1) return 1;
        return n + sumOfNNumbers(n-1);
    }
}
