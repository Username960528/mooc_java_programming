package NumbersFromAFile;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class NumbersFromAFile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("File? ");
        String file = scanner.nextLine();
        ArrayList<Integer> list = new ArrayList<>();

        try (Scanner read = new Scanner(Paths.get(file))) {
            while (read.hasNextLine()) {
                // Преобразовываем каждую строку в число и добавляем в список
                list.add(Integer.valueOf(read.nextLine()));
            }
        } catch (Exception e) {
            System.out.println("Fail: " + e);
            return; // Если ошибка при чтении файла, то прерываем выполнение
        }

        System.out.print("Lower bound? ");
        int lowerBound = Integer.valueOf(scanner.nextLine());
        System.out.print("Upper bound? ");
        int upperBound = Integer.valueOf(scanner.nextLine());
        int count = 0;

        // Итерируем по элементам списка, проверяя каждое число на соответствие диапазону
        for (int num : list) {
            if (num >= lowerBound && num <= upperBound) {
                count++;
            }
        }
        System.out.println("Numbers: " + count);
    }
}