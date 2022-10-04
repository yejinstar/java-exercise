package example_1004;

import java.util.Scanner;

class Checking {
    String checkEven(int n) {
        if (n % 2 == 1) {
            return "홀수";
        } else {
            return "짝수";
        }
    }
}

public class OddEvenTest2 {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Checking check = new Checking();

        int[] arr = new int[2];
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
            sum += arr[i];
        }

        System.out.println(check.checkEven(arr[0]) + "+" + check.checkEven(arr[1]) + "=" + check.checkEven(sum)) ;

    }
}
