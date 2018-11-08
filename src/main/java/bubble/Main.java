package bubble;

public class Main {
    public static void main(String[] args) {
        int[] array = new int[]{1,10,100,21,5};

        printArray(array);
        bubbleSort(array);
        printArray(array);
    }

    private static void printArray(int[] array) {
        System.out.print("[");
        for (int i : array) {
            System.out.print(i + ", ");
        }
        System.out.println("]");
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

    private static void swap(int j, int i, int[] array) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
