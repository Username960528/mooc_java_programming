
import java.util.Scanner;

public class FirstWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true ) {
            String message = scanner.nextLine();
            if (message.isEmpty()) {
                break;
            }

            String[] pieces = message.split(" ");
//            for (String piece : pieces) {
//                System.out.println(piece);
//            }
            System.out.println(pieces[0]);
        }

    }
}
