package Main;

import Payment.*;

public class PaymentApp {

    public static void main(String[] args) {

        // Card Payment
        Payment card = new CardPayment();
        processPayment(card, 1000);

        // UPI Payment
        Payment upi = new UPIPayment();
        processPayment(upi, 500);

        // Net Banking Payment (Invalid case demo)
        Payment net = new NetBankingPayment();
        processPayment(net, -200);
    }

    static void processPayment(Payment payment, double amount) {
        System.out.println("\nUsing Payment Mode: " + payment.getPaymentMode());
        boolean result = payment.pay(amount);
        System.out.println("Payment Status: " + (result ? "SUCCESS" : "FAILED"));
    }
}
