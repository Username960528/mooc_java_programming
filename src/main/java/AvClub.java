
import java.util.Scanner;

public class AvClub {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String message = scanner.nextLine();
        String[] pieces = message.split(" ");
//        for (String piece : pieces) {
//            if (piece.contains("av")) {
//                System.out.println(piece);
//            }
        int index = 0;
        while (true) {
            if (pieces[index].contains("av")) {
                System.out.println(pieces[index]);
            }
            index++;
            if (index >= pieces.length) {
                System.out.println("finish");
                break;
            }
        }
    }

}

