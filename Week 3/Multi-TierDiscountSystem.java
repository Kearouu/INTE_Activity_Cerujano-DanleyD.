
public class Main {
    public static void main(String[] args) {
     System.out.println("==========MultiTier_Discount_System==========");
        double purchaseAmount = 5000;
        double discount;
        double finalPrice;

        if (purchaseAmount >= 5000) {
            discount = 15;
        } else if (purchaseAmount >= 3000) {
            discount = 10;
        } else if (purchaseAmount >= 1000) {
            discount = 5;
        } else {
            discount = 0;
        }

        finalPrice = purchaseAmount - (purchaseAmount * discount / 100);

        System.out.println("Purchase Amount: " + purchaseAmount);
        System.out.println("Discount Tier: " + discount + "%");
        System.out.println("Final Price: " + finalPrice);

    }
}
