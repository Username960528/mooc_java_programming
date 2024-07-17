package CountLinesAndLetters;

import java.util.Scanner;
import java.nio.file.Paths;

public class Main {
    public static void main(String[] args) {

        int lineCount = 0;
        int aletterCount = 0;
        long startTime = System.currentTimeMillis();

        try (Scanner scanner = new Scanner(Paths.get("/Users/tribe/DOwnloads/qatest.txt"))) {
            while (scanner.hasNextLine()) {
                String row = scanner.nextLine();
                lineCount++;

                for (char c : row.toCharArray()) {
                    if (c == 'a') {
                        aletterCount++;
                    }
                }
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        long endTime = System.currentTimeMillis();
        long timeTaken = endTime - startTime;
        System.out.println("1. Количество строк в файле: " + lineCount);
        System.out.println("2. Количество букв 'a': " + aletterCount);
        System.out.println("3. Время ушедшее на выполнение программы: " + (timeTaken / 60000) + " минут " + (timeTaken % 60000 / 1000) + " секунд " + (timeTaken % 1000) + " миллисекунды");
    }
}