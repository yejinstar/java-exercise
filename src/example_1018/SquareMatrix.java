package example_1018;

import java.util.Scanner;

public class SquareMatrix {

    void printSquare(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        SquareMatrix squareMatrix = new SquareMatrix();
        squareMatrix.printSquare(input);
    }
}
