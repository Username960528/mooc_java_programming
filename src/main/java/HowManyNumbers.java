import java.util.Scanner;
public class HowManyNumbers {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("How many numbers? ");
        int howMany = Integer.valueOf(reader.nextLine());

        int[] numbers = new int[howMany];

        System.out.println("Enter the numbers:");

        int index = 0;
        while (index < numbers.length) {
            numbers[index] = Integer.valueOf(reader.nextLine());
            index = index + 1;
        }


System.out.println("Here are the numbers again:");

        index = 0;
        while (index < numbers.length) {
            System.out.println(numbers[index]);
            index = index + 1;
        }
    }
}

