
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
     System.out.println("==========NESTED_LOGIN_VALIDATOR==========");
        Scanner input = new Scanner(System.in);

        String correctUsername = "Danley";
        String correctPassword = "Kearouleigh0113";
        boolean accountLocked = false;

        System.out.print("Enter username: ");
        String username = input.nextLine();

        System.out.print("Enter password: ");
        String password = input.nextLine();

        System.out.print("Is account locked? (true/false): ");
        accountLocked = input.nextBoolean();

        if (username.equals(correctUsername)) {

            if (password.equals(correctPassword)) {

                if (accountLocked == false) {
                    System.out.println("LOGIN SUCCESSFUL!");
                    System.out.println("Welcome, " + username);
                } else {
                    System.out.println("LOGIN FAILED: Account is locked.");
                }

            } else {
                System.out.println("LOGIN FAILED: Incorrect password.");
            }

        } else {
            System.out.println("LOGIN FAILED: Username not found.");
        }

        input.close();
    }
}
