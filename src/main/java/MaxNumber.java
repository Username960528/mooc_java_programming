

import java.util.Scanner;

public class MaxNumber {
    public static void main(String[] args) {        Scanner scanner = new Scanner(System.in);
        System.out.println("Give numbers:");
        int sum = 0;
        double average = 0;
        int count = 0;
        int even = 0;
        int odd = 0;
        while (true) {
            int numbers = Integer.valueOf(scanner.nextLine());
            if (numbers == -1) {
                System.out.println("Thx!Bye!");
                System.out.println("Sum: " + sum);
                System.out.println("Numbers: " + count);
                System.out.println("Average: " + average);
                System.out.println("Even: " + even);
                System.out.println("Odd: " + odd);
                break;
            }

                sum += numbers;
                count += 1;
                average = 1.0 * sum / count;


            if (numbers % 2 == 0) {
                even += 1;
            } else {
                odd += 1;
            }
        }
//
        }
    public static void greet() {
        System.out.println("Greetings!");
    }
}
