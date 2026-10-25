public class MyClass {
    public static void main(String[] args) {
        shoppingCalculator();
    }

    public static void shoppingCalculator() {
        System.out.println("==========Type Safe Shopping Calculator==========");

        int quantity = 5;
        double unitPrice = 20.07;
        String storeName = "TINDAHAN NI LEIGHLEY";

        double totalCost = quantity * unitPrice;

        System.out.println("Store Name: " + storeName);
        System.out.println("Quantity: " + quantity);
        System.out.println("Unit Price: " + unitPrice);
        System.out.println("Total Cost: " + totalCost);

        /* You can't use an int for totalCost because the unit price
           has decimal values for cents. Use double to store decimals. */
    }
}
