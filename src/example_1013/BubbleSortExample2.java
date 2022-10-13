package example_1013;

import java.util.Arrays;

public class BubbleSortExample2 {

    public int[] sort(int[] arr, int i) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;
                }
            }
        return arr;
    }

    public static void main(String[] args) {
        BubbleSortExample2 bubbleSortExample = new BubbleSortExample2();
        int[] arr = {7, 2, 3, 9, 28, 11};

        int[] answer = bubbleSortExample.sort(arr, 0); //단계적 sorting
        System.out.println(Arrays.toString(answer));
        answer = bubbleSortExample.sort(arr, 1);
        System.out.println(Arrays.toString(answer));
        answer = bubbleSortExample.sort(arr, 2);
        System.out.println(Arrays.toString(answer));
        answer = bubbleSortExample.sort(arr, 3);
        System.out.println(Arrays.toString(answer));
        answer = bubbleSortExample.sort(arr, 4);

        System.out.println(Arrays.toString(answer));
    }
}
