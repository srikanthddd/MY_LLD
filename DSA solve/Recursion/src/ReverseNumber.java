public class ReverseNumber {
    public static void main(String[] args) {
        int n = 1234;
        int digits = 4;
        int pow = digits - 1;
        System.out.println(reverseNumber(n, pow));
    }
    public static int reverseNumber(int n, int pow){
        if(n < 10) return n;
        return ( (n%10) * (int)Math.pow(10,pow)) + reverseNumber(n/10, pow - 1);
    }


}
