package Part05_15_Archive;


//import com.sun.tools.javac.jvm.Items;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> items = new ArrayList<>();
        while (true) {
            if (scanner.nextLine().isEmpty()) {
                break;
            }
            System.out.println("Identifier? (empy will stop)");
            String identifier = scanner.nextLine();
            items.add(identifier);
            System.out.println("Name? (empy will stop)");
            String name = scanner.nextLine();
            items.add(identifier);
        }

        System.out.println("==Items==");
        int count = 0;
        for (String item : items) {
            
        }

    }
}

