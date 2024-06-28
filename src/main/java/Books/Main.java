package Books;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // implement here the program that allows the user to enter
        // book information and to examine them
        Scanner read = new Scanner(System.in);
        ArrayList<Book> books = new ArrayList<>();

        while (true) {
            System.out.println("Title: ");
            String title = read.nextLine();
            if (title.isEmpty()) {
                break;
            }

            System.out.println("Pages: ");
            int pages = Integer.valueOf(read.nextLine());

            System.out.println("Publication year:");
            int year = Integer.valueOf(read.nextLine());

            books.add(new Book(title, pages, year));

        }
        System.out.println("What information will be printed?");
        String info = read.nextLine();
        for (Book search : books) {
            if (info.equals("everything")) {
                System.out.println(search);
            } else if (info.equals("name")) {
                    System.out.println(search.getTitle());

            }
        }

    }

}
