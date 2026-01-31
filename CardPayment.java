package Payment;

public class CardPayment implements Payment, Logger, Discount {

    @Override
    public boolean pay(double amount) {
        if (amount <= 0) {
            log("Invalid amount for Card Payment!");
            return false;
        }
        double finalAmount = applyDiscount(amount);
        log("Processing Card Payment of ₹" + finalAmount);
        return true;
    }

    @Override
    public String getPaymentMode() {
        return "Card Payment";
    }

    @Override
    public double applyDiscount(double amount) {
        return amount * 0.95;
    }
}
