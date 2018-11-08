package insertion_sort;

import static utils.Utils.printArray;

public class Main {
    public static void main(String[] args) {
        int[] array = new int[]{7,10,1,21,5};
        printArray(array);
        insertionSort(array);
        printArray(array);
    }

    private static void insertionSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int movedValue = array[i];
            int destination = i;
            for (int j = i-1; j >= 0; j--) {
                if(movedValue < array[j]) {
                    moveRight(array, j);
                    destination = j;
                } else {
                    break;
                }
            }
            array[destination] = movedValue;
        }
    }

    private static void moveRight(int[] array, int j) {
        array[j+1] = array[j];
    }
}
