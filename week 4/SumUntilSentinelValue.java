
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
     System.out.println("==========SUM_UNTIL_SENTINEL_VALUE==========");
        
        Scanner input = new Scanner(System.in);

        int number;
        int total = 0;

        System.out.println("Enter numbers to add (-1 to stop):");

        System.out.print("Enter number: ");
        number = input.nextInt();

        while (number != -1) {
            total = total + number;

            System.out.print("Enter number: ");
            number = input.nextInt();
        }

        System.out.println("Final Total: " + total);

        input.close();
    }
}
