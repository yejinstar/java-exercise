package example_1013;

public class BubbleSortExample {

    public int[] sort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;
                }
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        BubbleSortExample bubbleSortExample = new BubbleSortExample();
        int[] arr = {7, 2, 3, 9, 28, 11};
        int[] answer = bubbleSortExample.sort(arr);
        for (int n : answer) {
            System.out.print(n + " ");
        }
    }
}
