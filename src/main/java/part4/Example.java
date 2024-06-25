package part4;
import java.util.ArrayList;
import java.util.Scanner;

public class Example {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("test");
        int number = 5;
        Scanner reader = new Scanner(System.in);

        System.out.print("How many numbers? ");
        int howMany = Integer.valueOf(reader.nextLine());

        int[] numbers = new int[howMany];
        int[] numbers2 = new int[number];
//        numbers.
        System.out.println(numbers);
    }
}
