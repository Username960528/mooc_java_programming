
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        int count = 0;
        int index = 0;
        int largestLength = 0;
        String longestName = "";

        while (true) {
            String message = scanner.nextLine();
            if (message.isEmpty()) {
                break;
            }
            String[] pieces = message.split(",");

            sum += Integer.valueOf(pieces[1]);
            count++;

            if (pieces[0].length() > largestLength) {
                largestLength = pieces[0].length();
                longestName = pieces[0];
            }

        }
        if (count >= 1) {
            System.out.println("Age of oldest is: " + (1.0 * sum / count));
            System.out.println("Longest name: " + longestName);
        }
    }
}
