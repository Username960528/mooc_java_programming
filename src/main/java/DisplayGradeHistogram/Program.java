package DisplayGradeHistogram;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GradeRegister register = new GradeRegister();

        while (true) {
            System.out.println("Input points (or press enter to finish):");
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }

            try {
                int score = Integer.valueOf(input);
                if (score < 0 || score > 100) {
                    System.out.println("Impossible number. Please enter a number between 0 and 100.");
                    continue;
                }
                register.addGradeBasedOnPoints(score);
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid number.");
            }
        }

        System.out.println("\nGrade distribution:");
        for (int grade = 5; grade >= 0; grade--) {
            int stars = register.numberOfGrades(grade);
            System.out.print(grade + ": ");
            for (int i = 0; i < stars; i++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
