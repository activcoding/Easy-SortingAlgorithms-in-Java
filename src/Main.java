public class Main {
    public static void main(String[] args) {
        SortingAlgorithms sortingAlgorithms = new SortingAlgorithms();
        //int[] numbers = {2, 5, 2, 7, 3, 3, 3, 5, 20, 1};
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        //int[] sortedNumbers = sortingAlgorithms.bubbleSort(numbers);
        sortingAlgorithms.quickSort(numbers, 0, numbers.length - 1);
        for (int sortedNumber : numbers) {
            System.out.println(sortedNumber);
        }


    }
}
