
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
     System.out.println("==========PATTERN GENERATOR WITH EARLY EXIT==========");
        Scanner input = new Scanner(System.in);

        System.out.print("Enter pattern size: ");
        int size = input.nextInt();

        for (int row = 1; row <= size; row++) {

            // CONTINUE: Skip row 3 entirely
            if (row == 3) {
                continue;
            }

            for (int col = 1; col <= size; col++) {

                // BREAK: Stop the inner loop when column reaches 4
                if (col == 4) {
                    break;
                }

                System.out.print("* ");
            }

            System.out.println();
        }

        input.close();
    }
}
