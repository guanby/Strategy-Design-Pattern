package after.paymentmethods;

import after.paymentmethods.PaymentStrategy;

public class PayWithPayNow implements PaymentStrategy {

    private String phoneNumber;

    @Override
    public void collectPaymentDetails() {
        // Pop-up to collect PayNow details...
        phoneNumber = "PayNow Phone Number";
        System.out.println("Collecting PayNow Account Details...");
    }

    @Override
    public boolean validatePaymentDetails() {
        // Validate account...
        System.out.printf("Validating PayNow Info: %s", phoneNumber);
        return true;
    }

    @Override
    public void pay(int amount) {
        System.out.println("Paying " + amount + " using PayNow");
    }

}