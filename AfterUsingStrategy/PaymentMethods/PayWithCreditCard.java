package after.paymentmethods;

import after.paymentmethods.CreditCard;
import after.paymentmethods.PaymentStrategy;

public class PayWithCreditCard implements PaymentStrategy {

    private CreditCard card;

    @Override
    public void collectPaymentDetails() {
        // Pop-up to collect card details...
        card = new CreditCard("5555444433332222", "expiryDate", "cvv");
        System.out.println("Collecting Card Details...");
    }

    @Override
    public boolean validatePaymentDetails() {
        // Validate credit card...
        System.out.println("Validating Card Info: " + card.getNumber());
        return true;
    }

    @Override
    public void pay(int amount) {
        System.out.println("Paying " + amount + " using Credit Card");
        card.setAmount(card.getAmount() - amount);
    }

}