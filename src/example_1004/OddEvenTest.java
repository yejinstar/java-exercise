package example_1004;

import java.util.Scanner;

public class OddEvenTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int input = 0;
        input = sc.nextInt();

        if (input % 2 == 1) {
            System.out.println("odd");
        } else {
            System.out.println("even");
        }
    }
}
