
import java.util.Scanner;

public class LastWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String message = scanner.nextLine();
            if (message.isEmpty()) {
                break;
            }

            String[] pieces = message.split(" ");
//            int index = 0;
//            for (String piece : pieces) {
//                index++;
//                if (index == pieces.length) {
//                    System.out.println(piece);
//                }
            System.out.println(pieces[pieces.length -1]);
            }
//            System.out.println(pieces.);
        }

    }
