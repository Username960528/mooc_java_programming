package DisplayGradeHistogram;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GradeRegister register = new GradeRegister();

        while (true) {
            System.out.println("Input points:");
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }
            int score = Integer.valueOf(input);
            if (score < 0 || score > 100) {
                System.out.printf("Impossible number");
                continue;
            }
            System.out.println("");
            int grade = 5;
            while (grade >= 0) {
                int stars = register.numberOfGrades(grade);
                System.out.print(grade + ": ");
                while (stars > 0) {
                    System.out.print("*");
                    stars--;
                }
                System.out.println("");
                grade = grade - 1;


            }
        }
    }

}
