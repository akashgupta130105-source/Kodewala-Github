package Statement;

public class DiscountCalculator {

   double MINIMUM_PURCHASE = 1000;
    double MAX_DISCOUNT = 2500;

    public double calculateDiscount(String customerType, double purchaseAmount) {
        if (purchaseAmount <= MINIMUM_PURCHASE) {
            return 0;
        }

        double discountPercent;

        switch (customerType.trim().toUpperCase()) {
            case "GOLD":
                discountPercent = 20;
                break;
            case "SILVER":
                discountPercent = 10;
                break;
            case "REGULAR":
                discountPercent = 5;
                break;
            default:
                throw new IllegalArgumentException("Invalid customer type: " + customerType);
        }

        double discount = purchaseAmount * discountPercent / 100;
        return Math.min(discount, MAX_DISCOUNT);
    }
}
