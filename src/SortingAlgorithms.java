import java.lang.reflect.Array;

public class SortingAlgorithms {
    public SortingAlgorithms() {}

    public void quickSort(int[] dataSet, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(dataSet, low, high);
            System.out.println("Recursing");
            quickSort(dataSet, low, pivotIndex - 1);
            quickSort(dataSet, pivotIndex + 1, high);
        }

    }

    private int partition(int[] dataSet, int low, int high) {
        int pivot = dataSet[high];
        int index = low - 1;

        for (int compareIndex = low; compareIndex <= high; compareIndex++) {
            if (dataSet[compareIndex] < pivot) {
                System.out.println(dataSet[compareIndex] + " is less than " + pivot);
                index++;
                swapElements(dataSet, index, compareIndex);
            }
        }
        swapElements(dataSet, index + 1, high);
        return index + 1;
    }
    public int[] bubbleSort(int[] numbers) {
        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = 0; j < numbers.length - 1; j++) {
                if (j + 1 > numbers.length) {
                    System.out.println("j + 1 is greater than the length of the array");
                    break;
                } else if (numbers[j] > numbers[j + 1]) {
                    /*
                    int temporary = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = temporary;
                    */

                    // XOR swap algorithm
                    // Array is being passed by reference, so no need to return it;
                    swapElements(numbers, j, j + 1);
                }

            }
        }

        return numbers;
    }

    public static void swapElements(int[] array, int index1, int index2) {
        System.out.println("Swapping " + index1 + " with " + index2);
        if (index1 == index2) {
            // No need to swap if the indices are the same
            return;
        }
        array[index1] ^= array[index2];
        array[index2] ^= array[index1];
        array[index1] ^= array[index2];
    }
}
