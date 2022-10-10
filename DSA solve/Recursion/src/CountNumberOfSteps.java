
//This is Leet code question. Link : https://leetcode.com/problems/number-of-steps-to-reduce-a-number-to-zero/
public class CountNumberOfSteps {

    public static void main(String[] args) {

        int num = 14;
        int count  = 0;
        System.out.println(countSteps(num, count));
    }
    public static int countSteps(int num, int count){
        if(num == 0){
            return count;
        }
        if(num % 2 == 0){
            return countSteps(num/2, count+1);
        }
        return countSteps(num-1, count +1);

    }
}
