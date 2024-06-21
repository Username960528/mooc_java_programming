import java.util.ArrayList;
import java.util.Scanner;

public class IndexOfSmallest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Reading user input until 9999 is entered
        ArrayList<Integer> list = new ArrayList<>();
        while (true) {
            int numbers = Integer.valueOf(scanner.nextLine());
            if (numbers == 9999) {
                break;
            }
            list.add(numbers);
        }

        // Finding the smallest number
        int smallest = list.get(0);
        for (int i = 1; i < list.size(); i++) {
            int number = list.get(i);
            if (smallest > number) {
                smallest = number;
            }
        }

        // Printing the smallest number
        System.out.println("Smallest number: " + smallest);

        // Finding and printing all indices of the smallest number
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == smallest) {
                System.out.println("Found at index: " + i);
            }
        }
    }
}