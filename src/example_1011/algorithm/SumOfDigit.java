package example_1011.algorithm;

public class SumOfDigit {

    public int Solution(int n) {

        int answer = 0;

        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        answer = sum;
        return answer;
    }


    public static void main(String[] args) {
        SumOfDigit sumOfDigit = new SumOfDigit();
        int result = sumOfDigit.Solution(1234);
        System.out.println(result);
    }
}
