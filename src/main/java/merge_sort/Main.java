package merge_sort;

import static utils.Utils.printArray;

public class Main {
    public static void main(String args[]) {
        System.out.println("hello");
        int[] array = new int[]{7,10,1,21,5};
        printArray(array);
        mergeSort(array);
        printArray(array);

        array = new int[]{12,31,5,1,35,123,2,6,23,6,4234,3};
        printArray(array);
        mergeSort(array);
        printArray(array);
    }

    private static void mergeSort(int[] array) {
        mergeSort(array, 0, array.length);
    }

    private static void mergeSort(int[] array, int lo, int count) {
        if(count <= 1) {
            return;
        }
        int countLeft = count / 2;
        int countRight = count % 2 == 1 ? countLeft + 1 : countLeft;
        mergeSort(array, lo, countLeft);
        mergeSort(array, lo + count / 2, countRight);
        merge(array, lo, countLeft, lo + count / 2, countRight);
    }

    private static void merge(int[] array, int left, int countLeft, int right, int countRight) {
        int[] arrayClone = array.clone();
        int leftIndex = left;
        int rightIndex = right;
        int takenFromLeft = 0;
        int takenFromRight = 0;
        for (int i = left; i < left + countLeft + countRight; i++) {
            if(takenFromLeft < countLeft && takenFromRight < countRight) {
                if(arrayClone[leftIndex] <= arrayClone[rightIndex]) {
                    array[i] = arrayClone[leftIndex];
                    leftIndex++;
                    takenFromLeft++;
                } else {
                    array[i] = arrayClone[rightIndex];
                    rightIndex++;
                    takenFromRight++;
                }
            } else if (takenFromLeft < countLeft) {
                array[i] = arrayClone[leftIndex];
                leftIndex++;
                takenFromLeft++;
            } else {
                array[i] = arrayClone[rightIndex];
                rightIndex++;
                takenFromRight++;
            }
        }
    }
}
