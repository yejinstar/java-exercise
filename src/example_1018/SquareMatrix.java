package example_1018;

import java.util.Scanner;

public class SquareMatrix {

    void printSquare(int n,int m) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <m; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input1 = sc.nextInt();
        int input2 = sc.nextInt();
        SquareMatrix squareMatrix = new SquareMatrix();
        squareMatrix.printSquare(input1,input2);
    }
}
