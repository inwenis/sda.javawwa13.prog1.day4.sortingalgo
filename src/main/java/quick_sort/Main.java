package quick_sort;

import static utils.Utils.printArray;
import static utils.Utils.swap;

public class Main {
    public static void main(String[] args) {
        int[] array = new int[]{7,10,1,21,5};
        printArray(array);
        quickSort(array);
        printArray(array);

        array = new int[]{12,31,5,1,35,123,2,6,23,6,4234,3};
        printArray(array);
        quickSort(array);
        printArray(array);
    }

    // quicksort inspired by https://visualgo.net/en/sorting
    private static void quickSort(int[] array) {
        quickSort(array, 0, array.length);
    }

    private static void quickSort(int[] array, int lo, int hi) {
        if(hi - lo < 1) {
            return;
        }
        int pivotIndex = lo;
        int storeIndex = pivotIndex + 1;
        for (int i = pivotIndex + 1; i < hi; i++) {
            if(array[i] < array[pivotIndex]) {
                swap(i, storeIndex, array);
                storeIndex++;
            }
        }
        swap(pivotIndex, storeIndex - 1, array);
        quickSort(array, lo, storeIndex - 1);
        quickSort(array, storeIndex, hi);
    }
}
