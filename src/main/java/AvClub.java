import java.util.Scanner;

public class AvClub {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String message = scanner.nextLine();
            if (message.isEmpty()) {
                break;
            }

            String[] pieces = message.split(" ");
//            for (String piece : pieces) {
//                if (piece.contains("av")) {
//                    System.out.println(piece);
//                }
            System.out.println(pieces[0]);
        }
    }
}