
import java.util.ArrayList;
import java.util.Scanner;

public class IndexOf {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();
        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            if (input == -1) {
                break;
            }

            list.add(input);
        }

        System.out.println("");

        // implement here finding the indices of a number
        int index = list.size() - 1;
        System.out.println("Search for?");
        int number = Integer.valueOf(scanner.nextLine());
        for (int i = 0;i < index;i++) {
            int search = list.get(i);
            if (search == number) {
                System.out.println(number + " is at index " + i);
            }
        }
    }
}
