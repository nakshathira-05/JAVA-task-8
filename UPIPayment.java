package Payment;

public class UPIPayment implements Payment, Logger {

    @Override
    public boolean pay(double amount) {
        if (amount <= 0) {
            log("Invalid amount for UPI Payment!");
            return false;
        }
        log("Processing UPI Payment of ₹" + amount);
        return true;
    }

    @Override
    public String getPaymentMode() {
        return "UPI Payment";
    }
}
