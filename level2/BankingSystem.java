package level2;
import java.util.Scanner;

// Base class for Bank Account
class BankAccount {
    private String accountNumber;
    private String accountHolderName;
    private double balance;

    // Constructor
    public BankAccount(String accountNumber, String accountHolderName, double initialBalance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = initialBalance;
    }

    // Method to deposit amount
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("✅ Deposit successful. Updated balance: ₹" + balance);
        } else {
            System.out.println("❌ Invalid deposit amount.");
        }
    }

    // Method to withdraw amount
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("✅ Withdrawal successful. Updated balance: ₹" + balance);
        } else {
            System.out.println("❌ Insufficient balance or invalid amount.");
        }
    }

    // Method to display account info
    public void displayAccountInfo() {
        System.out.println("\n--- Account Information ---");
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolderName);
        System.out.println("Current Balance: ₹" + balance);
        System.out.println("--------------------------\n");
    }
}

// Main class to run the banking system
public class BankingSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input account details
        System.out.print("Enter Account Number: ");
        String accNo = scanner.nextLine();

        System.out.print("Enter Account Holder Name: ");
        String accName = scanner.nextLine();

        System.out.print("Enter Initial Balance: ₹");
        double initBalance = Double.parseDouble(scanner.nextLine());

        BankAccount account = new BankAccount(accNo, accName, initBalance);

        int choice;
        do {
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. View Account Info");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {
                case 1:
                    System.out.print("Enter deposit amount: ₹");
                    double depositAmount = Double.parseDouble(scanner.nextLine());
                    account.deposit(depositAmount);
                    break;
                case 2:
                    System.out.print("Enter withdrawal amount: ₹");
                    double withdrawAmount = Double.parseDouble(scanner.nextLine());
                    account.withdraw(withdrawAmount);
                    break;
                case 3:
                    account.displayAccountInfo();
                    break;
                case 4:
                    System.out.println("Thank you for using our banking system. Have a great day!");
                    break;
                default:
                    System.out.println("❌ Invalid choice. Please try again.");
            }
        } while (choice != 4);

        scanner.close();
    }
}