
public class MyClass {
    public static void main(String[] args) {

        System.out.println("==========Unit Casting Converter==========");

        double centimeters =190.75;

        int meters = (int) centimeters / 100;
        double remainingCentimeters = centimeters - (meters * 100);

        System.out.println("Centimeters: " + centimeters);
        System.out.println("Whole Meters: " + meters);
        System.out.println("Remaining Centimeters: " + remainingCentimeters);

        int number = 13;
        double widenedNumber = number;

        // No cast is needed because it will  automatically converts int to double.
        System.out.println("Implicit Widening: " + widenedNumber);

        double price = 19.01;
        int wholePrice = (int) price;

        // Casting double to int removes the decimal part, so 19.75 becomes 19.
        System.out.println("Explicit Narrowing: " + wholePrice);
    }
}
