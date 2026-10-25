
import java.util.Scanner;

public class Main {

    static int[][] warehouse = {
        {20, 15, -1, 8},
        {5, 2, 18, 12},
        {0, 25, 7, -1}
    };

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n===== WAREHOUSE INVENTORY SYSTEM =====");
            System.out.println("1. Display Inventory");
            System.out.println("2. Total Inventory");
            System.out.println("3. Find Critical Shelf");
            System.out.println("4. Restock Shelf");
            System.out.println("5. Exit");

            choice = readInt(input, "Enter choice: ");

            switch (choice) {

                case 1:
                    System.out.println("\nWAREHOUSE INVENTORY");

                    for (int row = 0; row < warehouse.length; row++) {
                        for (int col = 0; col < warehouse[row].length; col++) {
                            if (warehouse[row][col] == -1) {
                                System.out.print("[DAMAGED] ");
                            } else {
                                System.out.print(warehouse[row][col] + " ");
                            }
                        }
                        System.out.println();
                    }
                    break;

                case 2:
                    int total = 0;

                    for (int row = 0; row < warehouse.length; row++) {
                        for (int col = 0; col < warehouse[row].length; col++) {

                            // CONTINUE: Skip damaged shelves
                            if (warehouse[row][col] == -1) {
                                continue;
                            }

                            total += warehouse[row][col];
                        }
                    }

                    System.out.println("Total Inventory: " + total);
                    break;

                case 3:
                    boolean found = false;

                    // BREAK: Stop both loops after finding the first critical shelf
                    search:
                    for (int row = 0; row < warehouse.length; row++) {
                        for (int col = 0; col < warehouse[row].length; col++) {

                            if (warehouse[row][col] >= 0
                                    && warehouse[row][col] <= 3) {

                                System.out.println("Critical Shelf Found!");
                                System.out.println("Row: " + (row + 1));
                                System.out.println("Column: " + (col + 1));
                                System.out.println("Items: " + warehouse[row][col]);

                                found = true;
                                break search;
                            }
                        }
                    }

                    if (!found) {
                        System.out.println("No critical shelves found.");
                    }
                    break;

                case 4:
                    restock(input);
                    break;

                case 5:
                    System.out.println("Exiting Inventory System...");
                    break;

                default:
                    System.out.println("Invalid choice. Select 1 to 5.");
            }

        } while (choice != 5);

        input.close();
    }

    // Read an integer and reject non-numeric input
    public static int readInt(Scanner input, String message) {

        while (true) {
            System.out.print(message);

            if (input.hasNextInt()) {
                int number = input.nextInt();
                input.nextLine();
                return number;
            } else {
                System.out.println("Invalid input! Enter a whole number.");
                input.nextLine();
            }
        }
    }

    // Restock a shelf with input validation
    public static void restock(Scanner input) {

        int row = readInt(input, "Enter shelf row (1-3): ");

        while (row < 1 || row > warehouse.length) {
            System.out.println("Invalid row number!");
            row = readInt(input, "Enter shelf row (1-3): ");
        }

        int col = readInt(input, "Enter shelf column (1-4): ");

        while (col < 1 || col > warehouse[row - 1].length) {
            System.out.println("Invalid column number!");
            col = readInt(input, "Enter shelf column (1-4): ");
        }

        if (warehouse[row - 1][col - 1] == -1) {
            System.out.println("Cannot restock a damaged shelf.");
            return;
        }

        int quantity = readInt(input, "Enter quantity to add: ");

        while (quantity <= 0) {
            System.out.println("Quantity must be greater than zero!");
            quantity = readInt(input, "Enter quantity to add: ");
        }

        warehouse[row - 1][col - 1] += quantity;

        System.out.println("Restocking successful!");
        System.out.println("Updated Shelf Count: "
                + warehouse[row - 1][col - 1]);

        // RETURN: End the restock method and return to the menu
        return;
    }
}
