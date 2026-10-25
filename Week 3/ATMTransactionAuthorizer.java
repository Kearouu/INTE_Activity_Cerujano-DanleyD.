
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
     System.out.println("==========ATM TRANSACTION AUTHORIZER==========");
        Scanner input = new Scanner(System.in);

        String correctUsername = "Danley";
        int correctPIN = 1319;
        double balance = 25000;
        double withdrawal;
        double limit;
        double feeRate;
        double fee;
        String tier;

        System.out.print("Enter username: ");
        String username = input.nextLine();

        System.out.print("Enter PIN: ");
        int pin = input.nextInt();

        // Check username and PIN
        if (username.equals(correctUsername)) {
            if (pin == correctPIN && pin >= 1000 && pin <= 9999) {

                System.out.println("Login Successful!");

                // Determine account tier
                if (balance >= 50000) {
                    tier = "Platinum";
                    limit = 30000;
                } else if (balance >= 25000) {
                    tier = "Gold";
                    limit = 20000;
                } else if (balance >= 10000) {
                    tier = "Silver";
                    limit = 10000;
                } else {
                    tier = "Bronze";
                    limit = 5000;
                }

                System.out.println("Account Tier: " + tier);
                System.out.println("Balance: PHP " + balance);

                System.out.print("Enter withdrawal amount: ");
                withdrawal = input.nextDouble();

                // Determine transaction fee
                switch (tier) {
                    case "Platinum":
                        feeRate = 0.01;
                        break;
                    case "Gold":
                        feeRate = 0.02;
                        break;
                    case "Silver":
                        feeRate = 0.03;
                        break;
                    default:
                        feeRate = 0.05;
                }

                fee = withdrawal * feeRate;

                // Check withdrawal
                if (withdrawal > 0) {
                    if (withdrawal + fee <= balance) {
                        if (withdrawal <= limit) {

                            System.out.println("TRANSACTION APPROVED!");
                            System.out.println("Withdrawal: PHP " + withdrawal);
                            System.out.println("Fee: PHP " + fee);
                            System.out.println("Remaining Balance: PHP "
                                    + (balance - withdrawal - fee));

                        } else {
                            System.out.println("TRANSACTION DENIED!");
                            System.out.println("Reason: Daily limit exceeded.");
                        }
                    } else {
                        System.out.println("TRANSACTION DENIED!");
                        System.out.println("Reason: Insufficient balance.");
                    }
                } else {
                    System.out.println("TRANSACTION DENIED!");
                    System.out.println("Reason: Invalid withdrawal amount.");
                }

            } else {
                System.out.println("LOGIN FAILED: Incorrect PIN.");
            }
        } else {
            System.out.println("LOGIN FAILED: Incorrect username.");
        }

        input.close();
    }
}
