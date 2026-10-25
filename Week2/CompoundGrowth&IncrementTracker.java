
public class Main {
    public static void main(String[] args) {

        System.out.println("==========Compound Growth & Increment Tracker==========");

        double balance = 3000.00;

        System.out.println("Starting Balance: " + balance);

        balance += 300;
        System.out.println("After adding 200: " + balance);

        balance *= 2.10;
        System.out.println("After 10% growth: " + balance);

        balance += 250;
        System.out.println("After adding 150: " + balance);

        System.out.println();
        System.out.println("==========Increment Tracker==========");

        int count = 5;

        System.out.println("Postfix: " + count++);
        System.out.println("Count after postfix: " + count);

        System.out.println("Prefix: " + ++count);
        System.out.println("Count after prefix: " + count);

        // Postfix prints the current value before increasing it.
        // Prefix increases the value first, then prints the new value.
    }
}
