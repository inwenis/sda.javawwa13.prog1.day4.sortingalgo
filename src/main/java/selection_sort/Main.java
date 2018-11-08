package selection_sort;

import static utils.Utils.printArray;
import static utils.Utils.swap;

public class Main {
    public static void main(String[] args) {
        int[] array = new int[]{7,10,1,21,5};
        printArray(array);
        selectionSort(array);
        printArray(array);
    }

    private static void selectionSort(int[] array) {
        int sortedIndex = 0;
        for (int j = 0; j < array.length; j++) {
            int minIndex = sortedIndex;
            for (int i = sortedIndex + 1; i < array.length; i++) {
                if (array[i] < array[minIndex]) {
                    minIndex = i;
                }
            }
            swap(sortedIndex, minIndex, array);
            sortedIndex++;
        }
    }
}
