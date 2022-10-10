public class SumOf_N_Digits {
    public static void main(String[] args) {
        int n = 1342;
        System.out.println(sumOf_N_Digits(n));
    }
    public static int sumOf_N_Digits(int n){
        if(n<10) return 1;
        return (n%10) + sumOf_N_Digits(n/10);
    }
}
