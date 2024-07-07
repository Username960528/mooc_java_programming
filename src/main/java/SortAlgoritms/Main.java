package SortAlgoritms;

import static SortAlgoritms.BubbleSort.bubbleSort;

public class Main {
    public static void main(String[] args) {

        int[] array = {33, 22, 11, 234, 3, 56};
        bubbleSort(array);
        System.out.println("Отсортированный массив: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");

        }
    }
}