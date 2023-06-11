import java.lang.reflect.Array;

public class Main {
    public static void main(String[] args) {
        SortingAlgorithms sortingAlgorithms = new SortingAlgorithms();
        int[] numbers = {2, 5, 2, 7, 3, 3, 3, 5, 20, 1};
        int[] sortedNumbers = sortingAlgorithms.bubbleSort(numbers);

        for (int i = 0; i < sortedNumbers.length; i++) {
            System.out.println(sortedNumbers[i]);
        }
    }
}