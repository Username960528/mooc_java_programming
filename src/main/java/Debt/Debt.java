package Debt;

public class Debt {

    private double balance;
    private double interestRate;

    // Constructor to initialize the debt with a balance and an interest rate
    public Debt(double initialBalance, double interestRate) {
        this.balance = initialBalance;
        this.interestRate = interestRate;
    }

    // Method to print the current balance
    public void printBalance() {
        System.out.println(this.balance);
    }

    // Method to simulate waiting one year and accumulating interest on the balance
    public void waitOneYear() {
        this.balance *= this.interestRate;  // This will correctly update the balance
    }
}
