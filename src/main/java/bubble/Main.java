package bubble;

import static utils.Utils.printArray;
import static utils.Utils.swap;

public class Main {
    public static void main(String[] args) {
        int[] array = new int[]{1,10,100,21,5};

        printArray(array);
        bubbleSort(array);
        printArray(array);

        array = new int[]{1,10,100,21,5};
        bubbleSort_optimized(array);
        printArray(array);
    }

    public static void bubbleSort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                if(array[j] > array[j+1]) {
                    swap(j, j+1, array);
                }
            }
        }
    }

    public static void bubbleSort_optimized(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - 1 - i; j++) {
                if(array[j] > array[j+1]) {
                    swap(j, j+1, array);
                }
            }
        }
    }
}
