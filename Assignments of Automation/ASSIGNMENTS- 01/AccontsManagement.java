/*5	Design a console-based Bank Management Program in Java that allows a user to create a bank account and 
perform basic banking operations such as deposit, withdrawal, balance enquiry, and account details display. 
The program should handle exceptions as required. */

import java.util.InputMismatchException;
import java.util.Scanner;

public class AccontsManagement {

    // These variables store account information.
    static String accountHolderName;
    static String accountNumber;
    static String accountType;
    static double balance;
    static boolean accountCreated = false;

    // This method is used to create a new bank account.
    static void createAccount(Scanner sc) {
        sc.nextLine();

        System.out.print("Enter account holder name: ");
        accountHolderName = sc.nextLine();

        System.out.print("Enter account number: ");
        accountNumber = sc.nextLine();

        System.out.print("Enter account type: ");
        accountType = sc.nextLine();

        System.out.print("Enter opening balance: ");
        balance = sc.nextDouble();

        // Opening balance cannot be negative.
        if (balance < 0) {
            throw new IllegalArgumentException("Opening balance cannot be negative.");
        }

        accountCreated = true;
        System.out.println("Account created successfully.");
    }

    // This method is used to deposit money into the account.
    static void deposit(double amount) {
        // Deposit amount must be greater than zero.
        if (amount <= 0) {
            throw new IllegalArgumentException("Deposit amount must be greater than zero.");
        }

        balance = balance + amount;
        System.out.println("Amount deposited successfully.");
    }

    // This method is used to withdraw money from the account.
    static void withdraw(double amount) {
        // Withdrawal amount must be greater than zero.
        if (amount <= 0) {
            throw new IllegalArgumentException("Withdrawal amount must be greater than zero.");
        }

        // User cannot withdraw more money than available balance.
        if (amount > balance) {
            throw new IllegalArgumentException("Insufficient balance.");
        }

        balance = balance - amount;
        System.out.println("Amount withdrawn successfully.");
    }

    // This method displays the current account balance.
    static void balanceEnquiry() {
        System.out.println("Current balance: " + balance);
    }

    // This method displays all account details.
    static void displayAccountDetails() {
        System.out.println("\n----- Account Details -----");
        System.out.println("Account holder name: " + accountHolderName);
        System.out.println("Account number: " + accountNumber);
        System.out.println("Account type: " + accountType);
        System.out.println("Balance: " + balance);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice = 0;

        do {
            try {
                System.out.println("\n----- Bank Management Menu -----");
                System.out.println("1. Create Account");
                System.out.println("2. Deposit");
                System.out.println("3. Withdraw");
                System.out.println("4. Balance Enquiry");
                System.out.println("5. Display Account Details");
                System.out.println("6. Exit");
                System.out.print("Enter your choice: ");
                choice = sc.nextInt();

                switch (choice) {
                    case 1:
                        createAccount(sc);
                        break;

                    case 2:
                        // Deposit can be done only after account creation.
                        if (!accountCreated) {
                            System.out.println("Please create an account first.");
                            break;
                        }

                        System.out.print("Enter amount to deposit: ");
                        double depositAmount = sc.nextDouble();
                        deposit(depositAmount);
                        break;

                    case 3:
                        // Withdrawal can be done only after account creation.
                        if (!accountCreated) {
                            System.out.println("Please create an account first.");
                            break;
                        }

                        System.out.print("Enter amount to withdraw: ");
                        double withdrawAmount = sc.nextDouble();
                        withdraw(withdrawAmount);
                        break;

                    case 4:
                        if (!accountCreated) {
                            System.out.println("Please create an account first.");
                        } else {
                            balanceEnquiry();
                        }
                        break;

                    case 5:
                        if (!accountCreated) {
                            System.out.println("Please create an account first.");
                        } else {
                            displayAccountDetails();
                        }
                        break;

                    case 6:
                        System.out.println("Program ended.");
                        break;

                    default:
                        System.out.println("Invalid choice.");
                }
            } catch (InputMismatchException e) {
                // This block runs when user enters wrong input type.
                System.out.println("Invalid input. Please enter numbers where required.");
                sc.nextLine();
            } catch (IllegalArgumentException e) {
                // This block displays custom error messages for invalid banking operations.
                System.out.println("Error: " + e.getMessage());
            }
        } while (choice != 6);

        sc.close();
    }
}
