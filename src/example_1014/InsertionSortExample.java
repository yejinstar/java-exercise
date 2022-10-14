package example_1014;

import java.util.Arrays;

public class InsertionSortExample {

    public int[] sort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            for (int j = i; j > 0; j--) {
                if (arr[j] < arr[j - 1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = tmp;
                }
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {8, 5, 6, 2, 4};
        InsertionSortExample insertionSortExample = new InsertionSortExample();
        System.out.println(Arrays.toString(insertionSortExample.sort(arr)));
    }
}
