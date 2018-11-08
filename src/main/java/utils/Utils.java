package utils;

public class Utils {
    public static void printArray(int[] array) {
        System.out.print("[");
        for (int i : array) {
            System.out.print(i + ", ");
        }
        System.out.println("]");
    }

    public static void swap(int j, int i, int[] array) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
