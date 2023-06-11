public class SortingAlgorithms {
    public SortingAlgorithms() {}
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

                    swapElements(numbers, j, j + 1);
                }

            }
        }

        return numbers;
    }


    public static void swapElements(int[] array, int index1, int index2) {
        if (index1 == index2) {
            // No need to swap if the indices are the same
            return;
        }
        array[index1] ^= array[index2];
        array[index2] ^= array[index1];
        array[index1] ^= array[index2];
    }
}
