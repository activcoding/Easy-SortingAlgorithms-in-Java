public class SortingAlgorithms {
    public SortingAlgorithms() {}
    public int[] bubbleSort(int[] numbers) {
        int[] sortedNumbers = numbers;

        for (int i = 0; i < sortedNumbers.length - 1; i++) {
            for (int j = 0; j < sortedNumbers.length - 1; j++) {
                if (j + 1 > sortedNumbers.length) {
                    System.out.println("j + 1 is greater than the length of the array");
                    break;
                } else if (sortedNumbers[j] > sortedNumbers[j + 1]) {
                    /*
                    int temporary = sortedNumbers[j];
                    sortedNumbers[j] = sortedNumbers[j + 1];
                    sortedNumbers[j + 1] = temporary;
                     */

                    swapElements(sortedNumbers, j, j + 1);
                }

            }
        }

        return sortedNumbers;
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
