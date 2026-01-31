package Payment;

public class NetBankingPayment implements Payment, Logger {

    @Override
    public boolean pay(double amount) {
        if (amount <= 0) {
            log("Invalid amount for NetBanking!");
            return false;
        }
        log("Processing NetBanking Payment of ₹" + amount);
        return true;
    }

    @Override
    public String getPaymentMode() {
        return "Net Banking";
    }
}
